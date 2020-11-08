package easy;

public class shor {
    public  int com(int m,int n,int c){
        //m为2的幂
        //n为
        int i=1;
        double x=1;
        for(;x<n;x++)
       for(i=1;i<n;i++)
        {
            if(Math.pow(2,-(m+1))>Math.abs(c*1.0/Math.pow(2,m)-x/i))
            {
                System.out.println(x);
                return i;
            }

        }
        System.out.println("不满足");
        return 0;
    }
    public  int zhouqi(int m,int n,int mb)  //计算周期
    {
        //求模运算
        int i=0;
        int k=0;
        int[] z=new int[n];
        for(i=0;i<n;i++)
        {
            if(i==0)
                z[0]=1;
            else {
                z[i] =  z[i - 1] * m % n;
                if (z[i] == 1) {
                    k=i;
                    System.out.println();
                }
            }
            System.out.print("i="+i+" 模="+z[i]+" ");
            if(i==mb)
                return z[i];
        }
        return k;
    }
    public int gcd(int m,int n)
    {
        int k=0;
        while(m%n!=0)
        {
            k=m%n;
            m=n;
            n=k;
        }
        return n;
    }
}
