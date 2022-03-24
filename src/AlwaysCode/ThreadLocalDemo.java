package AlwaysCode;

/**
 * @Author ACER
 * @Date:2022/3/16
 */
public class ThreadLocal {
    private volatile String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static void main(String[] args) {
        ThreadLocal local = new ThreadLocal();
      
        for(int i = 0; i < 10;i++){
            Thread thread = new Thread(() -> {
                local.setContent(Thread.currentThread().getName()+"修改");
                /*try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    System.out.println(Thread.currentThread().getName() +"--->"+local.getContent());
                }*/
                System.out.println(Thread.currentThread().getName() +"--->"+local.getContent());
            });
            thread.setName("thread"+i);
            thread.start();
        }
    }
}
