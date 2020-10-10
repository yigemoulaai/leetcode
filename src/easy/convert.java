package easy;

public class convert {
    public String convert(String s, int numRows) {
        int i,k;
        int j=2*numRows-2;
        String s1="";
        String[] s2=new String[numRows+1];
        char[] schar=s.toCharArray();
        if(s.length()<numRows||numRows==1)
        {
            s1=s;
        }
        else {
            for (i = 0; i < s.length(); i++) {
                if (i % j <= numRows - 1) {
                    if (s2[i % j] == null) {
                        s2[i % j] = String.valueOf(schar[i]);
                    } else {
                        s2[i % j] += schar[i];
                        System.out.println(schar[i]);
                    }

                }
                if (i % j > (numRows - 1)) {
                    if (s2[numRows - 1 - (i % (numRows - 1))] == null) {
                        s2[numRows - 1 - (i % (numRows - 1))] = String.valueOf(schar[i]);
                    } else
                        s2[numRows - 1 - (i % (numRows - 1))] += schar[i];
                }
            }
        }
       for(i=0;i<s2.length;i++)
       {
           if(s2[i]!=null)
           {
              // System.out.println(s2[i]);
               s1+=s2[i];
           }

       }


            return s1;
    }
}
