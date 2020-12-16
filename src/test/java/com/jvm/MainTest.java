package com.jvm;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/10/15  10:08
 * @https://blog.csdn.net/qq_31865983/article/details/98480703
 * @run  java -classpath "%JAVA_HOME%/lib/sa-jdi.jar" sun.jvm.hotspot.HSDB
 * @run  java -classpath "%JAVA_HOME%/lib/sa-jdi.jar" sun.jvm.hotspot.CLHSDB
 */
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

interface interTest{
    void show();
}

class Base{
    public int a;

    public Base(int a) {
        this.a = a;
    }
}

class A extends Base implements interTest  {
    public int b;
    public A(int a,int b) {
        super(a);
        this.b=b;
    }

    @Override
    public void show() {
        System.out.println("a->"+a+",b="+b);
    }
}


public class MainTest {

    public static void main(String[] args) {
        String s="shl";
        String[] s2={"shl","abc","bcd"};
        A a=new A(1,2);
        a.show();
        while (true){
            try {
                System.out.println(getProcessID());
                Thread.sleep(600*1000);
            } catch (Exception e) {

            }
        }
    }

    public static final int getProcessID() {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        System.out.println(runtimeMXBean.getName());
        return Integer.valueOf(runtimeMXBean.getName().split("@")[0])
                .intValue();
    }
}
