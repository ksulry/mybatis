package com.blocking.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/8/24  19:19
 */
public class ArrayBlcokingQueueTest {
    public static int infoNum = 50000000;
    public static void main(String[] args) {
        final BlockingQueue<InfoEvent> queue = new ArrayBlockingQueue<InfoEvent>(4000);
        final long startTime = System.currentTimeMillis();
        new Thread(new Runnable() {

            @Override
            public void run() {
                int pcnt = 0;
                while (pcnt < infoNum) {
                    InfoEvent kafkaInfoEvent = new InfoEvent(pcnt, pcnt+"info");
                    try {
                        queue.put(kafkaInfoEvent);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    pcnt++;
                }
            }
        }).start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                int cnt = 0;
                while (cnt < infoNum) {
                    try {
                        queue.take();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    cnt++;
                }
                long endTime = System.currentTimeMillis();
                System.out.println("消耗时间 ： " + (endTime - startTime) + "毫秒");
            }
        }).start();
    }
}
