package Fault;

public class findMaxForm {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] num=new int[strs.length][2];
        int[][] k=new int[m+1][n+1];
        for(int i=0;i<strs.length;i++)
        {
            char[] chars=strs[i].toCharArray();
            for(int j=0;j<strs[i].length();j++)
            {
                if(chars[j]=='0')
                    num[i][0]++;
                if(chars[j]=='1')
                    num[i][1]++;
            }
        }
        // System.out.println(num.length);
        int sum=0,lm=m;
        int ln=n;
        for(int i=0;i<=lm;i++)
        {
            for(int j=0;j<=ln;j++)
            {
                for(int z=0;z<num.length;z++)
                {
                    //  System.out.println(z);
                    if(i>=num[z][0]&&j>=num[z][1]&&(num[z][0]!=0||num[z][1]!=0))
                    {
                        System.out.println(lm+"   "+ln);
                        k[i][j]+=1;;
                        num[z][0]=0;
                        num[z][1]=0;
                        lm=lm-i;
                        ln=ln-j;
                        //break;
                    }
                }
            }
        }
        for(int i=0;i<=m;i++)
            for(int j=0;j<=n;j++)
            {
                if(k[i][j]!=0)
                {

                    sum+=k[i][j];
                }
            }
        return sum;

    }
}
