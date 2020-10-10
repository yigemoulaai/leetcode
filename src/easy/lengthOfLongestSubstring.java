package easy;


import java.util.ArrayList;
import java.util.List;

public class lengthOfLongestSubstring {
    public static void main(String[] args)
    {
        System.out.println((new Solution1().lengthOfLongestSubstring("adwerssd")));

    }}
class Solution1 {
    public int lengthOfLongestSubstring(String s) {
        List<Integer> l1=new ArrayList<Integer>();
        int k;
        int max=0;
        if(s.length()==1)
            max=1;
        for(int i=0;i<s.length()-1;i++)
        {
            String str=new String();
            k=0;
            str+=s.charAt(i);
            for(int j=i+1;j<s.length();j++)
            {

                if(str.indexOf(s.charAt(j))==-1)
                {

                    str+=s.charAt(j);
                }
                else
                    break;
            }
            l1.add(str.length());
        }
        if(l1.size()!=0) {
            max = l1.get(0);
            for (int i = 1; i < l1.size(); i++) {
                if (max < l1.get(i)) {
                    max = l1.get(i);
                }
            }
        }
        return  max;
    }

}