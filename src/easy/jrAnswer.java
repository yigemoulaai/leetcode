package easy;

public class jrAnswer {
    public void  jrAnswer(int x,int y)
    {
        int sx=x;
        int sy=y;
        if(x>=y)
            return;
        int m,n;
        int k=0;
        int[] c=new int[20];
        while(x>=1)
        {
            n=x;//x和y交换
            x=y;
            y=n;
            m=x%y;
            c[k++]=x/y;
            x=m;
        }
        c[k]=y;
       // double sum=0;
        int mb=0,ma,mc;
        for(int j=0;j<k;j++)
        {
            //System.out.println(c[j]);
            ma=1;
            mb=c[j];
           for(int t=j-1;t>=0;t--)
           {
               ma=mb*c[t]+ma;

                   mc=ma;
                   ma=mb;//
                   mb=mc;
           }

           //System.out.println(ma+"  "+mb+"  "+(double)sx/sy);
            //sum=Math.pow(sum+c[j],-1);
            if(Math.abs((sx*1.0)/sy-(ma*1.0)/mb)<1.0/(2*y))
            {
                if(mb!=1)
                {
                    double t=Math.abs((sx*1.0)/sy-(ma*1.0)/mb);
                    System.out.println("j/r有取值为"+ma+"/"+mb+"差值的绝对值："+t);
                    if(mb<21 )System.out.println("r结果"+mb+",模结果为"+new shor().zhouqi(2,21,3));
                }

            }


        }

    }
}
