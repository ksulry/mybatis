package com.jct;

import org.jctools.queues.MpscUnboundedArrayQueue;
import org.openjdk.jmh.annotations.Benchmark;

import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.*;

/**
 * 比较队列的消耗情况。
 *
 * @author hmilyylimh
 * ^_^
 * @version 0.0.1
 * ^_^
 * @date 2018/3/30
 */
public class CompareQueueCosts {

    /** 生产者数量 */
    private static int COUNT_OF_PRODUCER = 1;

    /** 消费者数量 */
    private static final int COUNT_OF_CONSUMER = 1;

    /** 准备添加的任务数量值 */
    private static final int COUNT_OF_TASK = 50000000;

    /** 线程池对象 */
    private static ExecutorService executorService;

    public static void main(String[] args) throws Exception {

       // for (int j = 1; j < 7; j++) {
            executorService = Executors.newFixedThreadPool(1);
            System.out.print("MpscUnboundedArrayQueue: " + testQueue(new MpscUnboundedArrayQueue<Integer>(65536), COUNT_OF_TASK) + "s" + "\t\t");
            System.out.println();
            System.out.println();
            executorService.shutdown();
       // }
    }

    @Benchmark
    public void measureName() throws Exception{
        executorService = Executors.newFixedThreadPool(1);
        testQueue(new MpscUnboundedArrayQueue<Integer>(65536), COUNT_OF_TASK);
        executorService.shutdown();
    }

    private static Double testQueue(final Collection<Integer> queue, final int taskCount) throws Exception {
        CompletionService<Long> completionService = new ExecutorCompletionService<Long>(executorService);

        long start = System.currentTimeMillis();

            executorService.submit(new Producer(queue, taskCount / COUNT_OF_PRODUCER));

            completionService.submit((new Consumer(queue, taskCount / COUNT_OF_CONSUMER)));


        for (int i = 0; i < COUNT_OF_CONSUMER; i++) {
            completionService.take().get();
        }

        long end = System.currentTimeMillis();
        return Double.parseDouble("" + (end - start)) / 1000;
    }

    private static class Producer implements Runnable {
        private Collection<Integer> queue;
        private int taskCount;

        public Producer(Collection<Integer> queue, int taskCount) {
            this.queue = queue;
            this.taskCount = taskCount;
        }

        @Override
        public void run() {
            Queue<Integer> tempQueue = (Queue<Integer>) this.queue;
            while (this.taskCount > 0) {
                if (tempQueue.offer(this.taskCount)) {
                    this.taskCount--;
                } else {
                    // System.out.println("Producer offer failed.");
                }
            }

        }
    }

    private static class Consumer implements Callable<Long> {
        private Collection<Integer> queue;
        private int taskCount;

        public Consumer(Collection<Integer> queue, int taskCount) {
            this.queue = queue;
            this.taskCount = taskCount;
        }

        @Override
        public Long call() {
            // Queue队列
            Queue<Integer> tempQueue = (Queue<Integer>) this.queue;
            while (this.taskCount > 0) {
                if ((tempQueue.poll()) != null) {
                    this.taskCount--;
                }
            }
            return 0L;
        }
    }

    //
}

