package easy;

public class isMatch {
    public  boolean isMatch(String s, String p)
    {
          char[] chars1=s.toCharArray();
          char[] chars2=p.toCharArray();
          int i=0,j=0;
          if(chars1.length==0&&chars2.length==0)
                 return  true;
          boolean[][] flag=new boolean[chars1.length+1][chars2.length+1];
            flag[0][0]=true;
            for(j=1;j<=chars2.length;j++)
            {
                if(j==1)  flag[0][j]=false;
                if(chars2[j-1]=='*'&&flag[0][j-2])
                {
                    flag[0][j]=true;
                }
               System.out.println(j-1+" "+flag[0][j-1]);
            }
            for(i=1;i<=chars1.length;i++)
            {
          for(j=1;j<=chars2.length;j++)
          {
             /* System.out.println(i);
              System.out.println(j);*/
              if (chars1[i-1] == chars2[j-1] || chars2[j-1] == '.') {
                flag[i][j]=flag[i-1][j-1];
              }
              else if(chars1[i-1] != chars2[j-1]&&chars2[j-1] != '.')
              {
                  /*第j-!位为*有三种判定形式
                  1.若匹配0位，则看重i-1和j-2的字符是否相匹配如匹配 则flag[i][j]=flag[i][j-2]
                  2.若匹配一位,则看重i-1和i-2位字符是否相同，若相同则flag[i][j]=flag[i][j-1]
                  3.若匹配多位，则看重前面的是否已经匹配完成 flag[i][j]=flag[i][j-1]
                  * */
              if (chars2[j-1] == '*' ) {
                  if(j<2)  flag[i][j]=false;
                  if(p.charAt(j-2)==s.charAt(i-1)||p.charAt(j-2)=='.'){
                      flag[i][j]=flag[i-1][j]||flag[i][j-1]||flag[i][j-2];
                  }
                  else if(p.charAt(j-2)!=s.charAt(i-1)&&p.charAt(j-2)!='.')
                  {
                      flag[i][j]=flag[i][j-2];
                  }
              }
              else flag[i][j]=false;

              };
          }
        //  System.out.println(flag[i-1][j-1]);
          }
        return  flag[chars1.length][chars1.length];
    }
}
