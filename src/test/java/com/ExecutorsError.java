package com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author ln
 * @Description:测试线程池异常处理
 * @date 2020/12/7  15:03
 */
public class ExecutorsError {
    public static void main(String[] args) throws Exception{
        ExecutorService es = Executors.newCachedThreadPool();
        Future<Integer> result = es.submit(() -> 1/0);
        int res = result.get();
        //System.out.println(res);
        es.shutdown();
    }
}
