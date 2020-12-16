package com.springboot.BaseJava;

import org.junit.Test;

/**
 * @author ln
 * @Description:
 * @date 2020/8/20  8:33
 */
public class TryCatch {
    /**
     * 执行顺序：
     * 1. ++ i =》 i = 2
     * 2. return ++ i=》 先进行++i，i变成3，缓存到return 变量中
     * 3. 在没有异常的情况下，执行finally语句；在进入代码块前 i = 3;
     * 4. 如果finally不存在return 语句，则返回try里面的变量，否则返回finally里面的
     * @return
     */
    public static int t() {
        int i = 1;
        try {
            ++i;
            System.out.println(i);
            //return i++ 和 ++ i在此处一样
            return i ++;
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        } finally {
           int a = 1 + i++;
            System.out.println("a:" + a);
            System.out.println(i);
            return i;
        }
    }

    public static void main(String[] args) {
        System.out.println(t());
    }

}
