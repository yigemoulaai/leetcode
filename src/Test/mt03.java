package AlwaysCode;

/**
 * @Author ACER
 * @Date:2022/3/26
 */
public class mt03 {
    public static void main(String[] args) {
        int[] no = {1,3,6,6,1};
        new mt03().dfs(no, 0,0);

    }
    public void dfs(int[] num, int index, int sum)
    {
        if(index == num.length )
        {
            System.out.println(sum);
            return;
        }
        for(int i = index ;i < num.length; i++){
            dfs(num, i+1, sum +num[i]);
        }
    }
}
