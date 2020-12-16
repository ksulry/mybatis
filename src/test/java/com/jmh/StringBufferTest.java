package com.jmh;

import org.openjdk.jmh.annotations.Benchmark;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/12/3  14:03
 */
public class StringBufferTest {




    @Benchmark
    public void measureName() {builderTest();}
        //bufferTest();
    //}


    @Benchmark
    public void measureName02() {
        test();
    }

    public void bufferTest(){
       StringBuffer sb = new StringBuffer();
       for (int i = 0; i < 500000; i++) {
           sb.append(i);
       }
   }
    public void builderTest(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 500000; i++) {
            sb.append(i);
        }
    }

    public void test(){
        String sb = "";
        for (int i = 0; i < 500000; i++) {
            sb += i;
        }
    }
}
