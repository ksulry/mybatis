package com.springboot.mybatis.disruptor;

import com.lmax.disruptor.EventHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/8/19  19:09
 */
@Slf4j
@Component
public class HelloEventHandler implements EventHandler<MessageModel> {

    @Override
    public void onEvent(MessageModel event, long sequence, boolean endOfBatch) {
        try {
            // 这里停止1000ms是为了确定消费消息是异步的
           // Thread.sleep(10);
            log.info("消费者处理消息开始");
            if (event != null) {
                log.info("消费者消费的信息是：{} 序列号 {}", event, sequence);
            }
        } catch (Exception e) {
            log.info("消费者处理消息失败");
        }
        log.info("消费者处理消息结束");
    }
}
