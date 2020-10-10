package easy;

public class licenseKeyFormatting {
    public String licenseKeyFormatting(String S, int K) {
        String s1= S.replaceAll("-","");
        int a=0,lenth=0;
        lenth=s1.length();
        //System.out.println(lenth);
        char[] chars=new char[lenth+s1.length()/K+1] ;
        char[] chars1=s1.toCharArray();
        for(int i=0;i<chars1.length;i++)
        {
            chars[i]=chars1[i];
            if(chars[i]>='a'&&chars[i]<='z')
            {
                chars[i]-=32;
            }
        }

        if(s1.length()%K!=0)
            a=(s1.length()%K);
        else a=K;
        for(;a<lenth;a+=K+1)
        {
            for(int j=lenth;j>a;j--)
            {
                // System.out.println(j);
                chars[j]=chars[j-1];
            }
            lenth++;
            chars[a]='-';
        }
        String schars=new String(chars).substring(0,lenth);


        return schars;
    }

}
