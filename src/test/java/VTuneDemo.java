import java.util.concurrent.atomic.AtomicLong;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/12/29  15:54
 */
public class VTuneDemo {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(()->{
            int sum = 0;
            for (int i = 0; i < 500000; i++) {
                sum ++;
            }
            System.out.println("sum值为:sum" + sum);
        });
        t1.setName("thread-01");
        t1.start();
        Thread.sleep(100000);
        Thread t2 = new Thread(()->{
            AtomicLong sum = new AtomicLong();
            for (int i = 0; i < 500000; i++) {
                sum.getAndIncrement();
            }
            System.out.println("第二种方式获取的sum值为:" + sum.get());
        });
        t2.start();
    }
}
