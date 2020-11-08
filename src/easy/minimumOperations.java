package easy;
/*
* 小扣出去秋游，途中收集了一些红叶和黄叶，他利用这些叶子初步整理了一份秋叶收藏集 leaves， 字符串 leaves 仅包含小写字符 r 和 y， 其中字符 r 表示一片红叶，字符 y 表示一片黄叶。
出于美观整齐的考虑，小扣想要将收藏集中树叶的排列调整成「红、黄、红」三部分。每部分树叶数量可以不相等，但均需大于等于 1。每次调整操作，小扣可以将一片红叶替换成黄叶或者将一片黄叶替换成红叶。请问小扣最少需要多少次调整操作才能将秋叶收藏集调整完毕。
*/
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
