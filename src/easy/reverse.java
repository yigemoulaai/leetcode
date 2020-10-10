package easy;

public class reverse {
    public int reverse(int x) {
        long  a;
        long sum=0;
        while(x!=0)
        {
            a=x%10;
            if(sum*10+a<Math.pow(2,31)-1&&sum*10+a>-Math.pow(2,31))
            {
                sum=sum*10+a;
            }
            else
            {
                sum=0;
                break;
            }

            x=x/10;
        }


    return (int)sum;

    }
}
