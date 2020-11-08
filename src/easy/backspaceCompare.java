package easy;


public class backspaceCompare {
    public boolean backspaceCompare(String S, String T) {
        char[] chars1 = new char[S.length()];
        char[] chars2 = new char[T.length()];
        char[] charS = S.toCharArray();
        char[] charT = T.toCharArray();
        int i = 0, j = 0, k1 = 0, k2 = 0;
        String s1 = chuli(charS);
        String s2=chuli(charT);
        System.out.println(s1+"  "+s2);
        if(s1==null&&s2==null)
            return true;
        else if(s1!=null)
        {
            if(s1.equals(s2))
                return true;
            return false;
        }
        else return false;
    }

    private String chuli(char[] S) {
        int i = 0, k1 = 0;
        char[] chars1 = new char[S.length];
       for (;i<S.length;i++){
            if (S[i] == '#') {
                if (k1 >= 1)
                    k1--;
            }
            else {
                chars1[k1++] = S[i];
            }
        }
        char[] c=new char[k1];
       if(k1==0)
           return null;
       for(int i1=0;i1<k1;i1++)
       {
           c[i1]=chars1[i1];
       }
        return new String(c);
    }
}
