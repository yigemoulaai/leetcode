package easy;

/**
 * @Author ACER
 * @Date:2022/1/25
 */
public class numberOfMatches {
    public int numberOfMatches(int n) {
        int res =0;
        while(n !=1){
            res +=(n +1) /2;
            n =n/2;
        }
        return res;
    }
}
