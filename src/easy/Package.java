package easy;

import java.util.ArrayList;
import java.util.List;

public class Package {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        int[] lemth=new int[strs.length];
        int minlen=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++)
        {
            lemth[i]=strs[i].length();
            if(minlen>lemth[i])
                minlen=lemth[i];
        }
        boolean flag=true;
        char s=' ';
        int k=0;
        for(int i=0;i<minlen;i++)
        {
            s=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++)
            {
                if(strs[j].charAt(i)!=s)
                {
                    flag=false;
                    break;
                }

            }
            if(flag==true)
                k++;
        }
        return strs[0].substring(0,k);
    }


}
