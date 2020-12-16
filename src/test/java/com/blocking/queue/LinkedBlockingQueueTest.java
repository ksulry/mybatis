package com.blocking.queue;

import org.openjdk.jmh.annotations.Benchmark;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/8/24  19:24
 */
public class LinkedBlockingQueueTest {

    public static int infoNum = 50000000;

    @Benchmark
    public void measureName() {
        final BlockingQueue<InfoEvent> queue = new LinkedBlockingQueue<InfoEvent>();
        final long startTime = System.currentTimeMillis();
        new Thread(new Runnable() {
            @Override
            public void run() {
                int pcnt = 0;
                while (pcnt < infoNum) {
                    InfoEvent kafkaInfoEvent = new InfoEvent(pcnt, pcnt + "info");
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
                System.out.println("消耗时间： " + (endTime - startTime) + "毫秒");
            }
        }).start();

    }

    public static void main(String[] args) {
        final BlockingQueue<InfoEvent> queue = new LinkedBlockingQueue<InfoEvent>();
        final long startTime = System.currentTimeMillis();
        new Thread(new Runnable() {
            @Override
            public void run() {
                int pcnt = 0;
                while (pcnt < infoNum) {
                    InfoEvent kafkaInfoEvent = new InfoEvent(pcnt, pcnt + "info");
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
                System.out.println("消耗时间： " + (endTime - startTime) + "毫秒");
            }
        }).start();
    }

}
