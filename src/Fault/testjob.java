package Fault;

public class testjob {
    public void fun(int a)
    {
        for(int i=1;i<a;i++)
        {
            if((i*516)%512==0)
                System.out.println(i);
        }

    }
}
