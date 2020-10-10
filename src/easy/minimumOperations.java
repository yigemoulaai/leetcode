package easy;

public class minimumOperations {
    public int minimumOperations(String leaves) {
        //要求达到   ryr模式
        char[] chars=leaves.toCharArray();
        int[][] m=new int[leaves.length()][3];   //二维数组的3列  0--r 1--y 2-r
        m[0][0]=chars[0]=='y'?1:0;   //第一个是否需要变成r
        m[0][1]=m[0][2]=m[1][2]=10;  //这三个元素不可能到达
        for(int i=1;i<leaves.length();i++)
        {
            int isred=chars[i]=='r'?1:0;
            int isyellow=chars[i]=='y'?1:0;
            m[i][0]=m[i-1][0]+isyellow;
            m[i][1]=Math.min(m[i-1][1],m[i-1][0])+isred;
            if(i>=2)
                m[i][2]=Math.min(m[i-1][1],m[i-1][2])+isyellow;

        }
        return  m[leaves.length()-1][2];
    }
}
