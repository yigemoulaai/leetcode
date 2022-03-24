package AlwaysCode;

/**
 * @Author ACER
 * @Date:2022/3/2
 */
public class ConcurrentThreadExchangePrint {
    public static void main(String[] args) {
        Object o = new Object();
        new Thread(()->{
            synchronized (o){for(char c : "12345".toCharArray()) {
                System.out.println(c);
                o.notifyAll();
            }
            try {
                o.wait(); //让出锁
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            }
        },"t1").start();
        new Thread(()->{
            synchronized (o){
                for(char c : "ABCDE".toCharArray()){
                    System.out.println(c);
                    o.notifyAll();
                    try {
                        o.wait(); //让出锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"t2").start();
    }
}
