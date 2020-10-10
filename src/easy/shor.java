package easy;

public class shor {
    public  int com(){
        int i=1;
        while(i<35)
        {
            if(Math.pow(2,-12)>Math.abs(341.0/Math.pow(2,11)-1.0/i))
                return i;
            i++;
        }
        //System.out.println(341.0/Math.pow(2,11));
        return 0;
    }
}
