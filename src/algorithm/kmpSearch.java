package algorithm;

public class kmpSearch {
    public int kmpsearch(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        int[] n = kmpNext(s2);
        for (int i = 0, j = 0; i < chars1.length; ) {
            if (chars1[i] == chars2[j]) {
                i++;
                j++;
                System.out.println("连续"+i);
            } else if (j > 0 && chars1[i] != chars1[j]) {
                i = i-n[j]+1;System.out.println("间断"+i);
                j = 0;
            }   else
            {
                i++;
                //System.out.println(i);
            }
           if(j==chars2.length-1)
                return i-j+1;

        }
        return -1;

    }
    public static int[] kmpNext(String s)
    {
        int[] next=new int[s.length()];
        char[] chars=s.toCharArray();
        next[0]=0;
        for(int i=1, j=0;i<s.length();i++)
        {
            if(j>0&&chars[i]!=chars[j])
                j=next[j-1];
            if(chars[i]==chars[j])
                j++;
            next[i]=j;
        }
        return next;

    }
}