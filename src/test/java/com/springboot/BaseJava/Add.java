package com.springboot.BaseJava;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/8/11  8:17
 */
public class Add {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i++ + i--);
        char x = 'X';

        int y = 0;

        System.out.println(true ? x : 0);

        System.out.println(false ? y : x);

    }
}
