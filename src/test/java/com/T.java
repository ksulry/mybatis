package com;

import java.util.HashMap;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/10/15  14:22
 */
public class T {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap();

        for (int i = 0; i < 10000000; i++) {
            map.put(""+ i ,"" + i);
        }
        System.out.println(map.size());
        System.out.println("中国");
        System.out.println(2 & 1);
        System.out.println('H' + 'a');
        try{
            System.out.println("hello world!!");
            System.exit(0);
        }finally {
            System.out.println("finally!!!");
        }
    }
}
