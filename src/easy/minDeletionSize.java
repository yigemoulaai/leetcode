package easy;

/*
* 给定由 N 个小写字母字符串组成的数组 A，其中每个字符串长度相等。
你需要选出一组要删掉的列 D，对 A 执行删除操作，使 A 中剩余的每一列都是 非降序 排列的，
然后请你返回 D.length 的最小可能值。
*/
public class minDeletionSize {
    public int minDeletionSize(String[] A) {
        int k=0;
        for(int i=0;i<A[0].length();i++)
        {
            for(int j=0;j<A.length-1;j++)
            {
                if(A[j].charAt(i)<A[j+1].charAt(i))
                {
                    k++;
                    break;
                }
            }
        }
            return k;
    }
}
