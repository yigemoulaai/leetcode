package Classic200;


/**
 * @Author ACER
 * @Date:2022/3/11
 */
public class extendTnode extends ITreeNode  {
       int  n =10; //实例变量
        static {
            System.out.println("ext static");
        }
    {
        System.out.println("ext 构造代码块");
    }

    public extendTnode() {
            System.out.println("ext 构造器代码");
    }

    public static void main(String[] args) {
            new extendTnode().OK();
    }

    @Override
    void start() {
        System.out.println("start");
    }
}

