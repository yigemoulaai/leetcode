package easy;

import java.util.ArrayList;
import java.util.List;

public class longestPalindrome {

    public String longestPalindrome(String s) {
        int i, j,begin=0 ,maxl=1;

        String restr="";
        int flag;
        char[] chars = s.toCharArray();
        if(s.length()==0||s.length()==1)
            restr=s;
        else {
            for (i = 0; i < s.length()-1; i++) {
                for(j=i+1;j<s.length();j++)
                {
                    if(valiable(chars,i,j)==true)
                    {
                        System.out.println(i+"  "+j);
                        if(j-i+1>maxl)
                        {
                            maxl=j-i+1;
                            begin=i;

                        }

                    }
                }
            }
        }   restr=s.substring(begin,begin+maxl);
                return  restr;
    }
    public  boolean valiable(char[] chars,int i,int j)
    {
        int left=i;
        int right=j;
        while(left<right)
        {

            if (chars[left]!=chars[right])
            {
                return  false;
            }
            left++;
            right--;
        }
        return  true;
    }


    }

