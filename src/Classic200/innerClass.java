package Classic200;

/**
 * @Author ACER
 * @Date:2022/3/14
 */
public class test1 {
    static User user2 =new User();
    //User user3 =new User();
    static {
        System.out.println(user2.toString());
    }
    static  class  User{
        public int x =10;
        static User user1 =new User();
        static {
            System.out.println(user1.toString() + "内部类代码块");
        }
        User(){
            System.out.println(user1+"构造器方法init");
        }
       // User user4 =new User();
    }

    public static void main(String[] args) {
        User user = new User();
        //test1 test1 = new test1();
        System.out.println(user.toString());
    }
}
