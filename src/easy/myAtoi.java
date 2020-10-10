package easy;

public class myAtoi {
    public  int myAtoi(String str) {
        char[] chars= str.toCharArray();
        int i=0;
        int  sum=0;
        System.out.println(Integer.MAX_VALUE);
        int flag=0,flag2=0;
        while(i<chars.length&&flag==0)
        {
            if(chars[i]==' ')
                i++;
            else  if(chars[i]>='0'&&chars[i]<='9')
            {

               if(sum*10+Integer.valueOf(chars[i]-'0')>Integer.MIN_VALUE&& sum*10+Integer.valueOf(chars[i]-'0')<Integer.MAX_VALUE)
                sum=sum*10+Integer.valueOf(chars[i]-'0');
                else if(sum*10+Integer.valueOf(chars[i]-'0')<=Integer.MIN_VALUE)
               {
                   return  Integer.MIN_VALUE;
               }
               else if(sum*10+Integer.valueOf(chars[i]-'0')>=Integer.MAX_VALUE)
               {
                   return  Integer.MAX_VALUE;
               }
                i++;
            }
            else if((chars[i]>='a'&&chars[i]<='z')||(chars[i]>='A'&&chars[i]<='Z'))
                flag=1;
            else if(chars[i]=='-')
            {
                flag2=1;
                i++;
            }
        }
        if(flag2==1)
            sum=-sum;
        return (int)sum;

    }

}
