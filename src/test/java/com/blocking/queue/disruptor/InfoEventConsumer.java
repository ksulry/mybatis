package com.blocking.queue.disruptor;

import com.blocking.queue.InfoEvent;
import com.lmax.disruptor.WorkHandler;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/8/24  19:22
 */
public class InfoEventConsumer implements WorkHandler<InfoEvent> {
    private long startTime;
    private volatile static int cnt = 0;

    public InfoEventConsumer() {
        this.startTime = System.currentTimeMillis();
    }

    @Override
    public void onEvent(InfoEvent event) {
        // TODO Auto-generated method stub
        cnt++;
        if (cnt == DisruptorTest.infoNum) {
            long endTime = System.currentTimeMillis();
            System.out.println(" 消耗时间： " + (endTime - startTime)/1000 + "秒");
        }

    }
}
