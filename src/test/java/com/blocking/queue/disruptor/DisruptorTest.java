package com.blocking.queue.disruptor;

import com.blocking.queue.InfoEvent;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.YieldingWaitStrategy;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;
import com.lmax.disruptor.util.DaemonThreadFactory;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/8/24  19:24
 */
public class DisruptorTest {
    public static int infoNum = 50000000;
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        InfoEventFactory factory = new InfoEventFactory();
        int ringBufferSize = 65536; //数据缓冲区的大小 必须为2的次幂

        /**
         *
         *  factory，定义的事件工厂
         *  ringBufferSize，环形队列RingBuffer的大小，必须是2的N次方
         *  ProducerType，生产者线程的设置，当你只有一个生产者线程时设置为 ProducerType.SINGLE，多个生产者线程ProducerType.MULTI
         *  waitStrategy，消费者的等待策略
         *
         */
        final Disruptor<InfoEvent> disruptor = new Disruptor<InfoEvent>(factory, ringBufferSize,
                DaemonThreadFactory.INSTANCE, ProducerType.SINGLE, new YieldingWaitStrategy());

        InfoEventConsumer consumer = new InfoEventConsumer();
        InfoEventConsumer consumer2 = new InfoEventConsumer();
        InfoEventConsumer consumer3 = new InfoEventConsumer();
        //将多个WorkHandler的实现类传入方法，封装成一个EventHandlerGroup实现多消费者消费。
        /**
         *  对于某一条消息m，handleEventsWith方法返回的EventHandlerGroup，Group中的每个消费者都会对m进行消费，
         *  各个消费者之间不存在竞争。handleEventsWithWorkerPool方法返回的EventHandlerGroup，
         *  Group的消费者对于同一条消息m不重复消费；也就是，如果c0消费了消息m，则c1不再消费消息m。
         *  传入的形参不同。对于独立消费的消费者，应当实现EventHandler接口。对于不重复消费的消费者，应当实现WorkHandler接口。
         *  disruptor.handleEventsWith(new OrderHandler1("1")).then(new OrderHandler1("2"), new OrderHandler1("3")).then(new OrderHandler1("4"));
         */
        disruptor.handleEventsWithWorkerPool(consumer);
        disruptor.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                RingBuffer<InfoEvent> ringBuffer = disruptor.getRingBuffer();
                for (int i = 0; i < infoNum; i++) {
                    long seq = ringBuffer.next();
                    InfoEvent infoEvent = ringBuffer.get(seq);
                    infoEvent.setId(i);
                    infoEvent.setValue("info" + i);
                    ringBuffer.publish(seq);
                }
            }
        }).start();
    }
}
