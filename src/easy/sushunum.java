package easy;

public class sushunum {
    //求出比n小的素数的数
    public int sushunum(int n)
    {
        int num=0;
        boolean flag=false;
        /*if(n==1)
            return 1;*/
        for(int i=1;i<n;i++)
        {
            flag=false;
            for(int j=1;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    if(j!=1)
                    {
                        flag=true;
                        break;
                    }

                }
            }
            if(flag==false)
                num++;

        }
        return num;
    }
}
