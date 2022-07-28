package Classic200;

/**
 * @Author ACER
 * @Date:2022/7/28
 */
public class multiply {
    public String multiply(String num1, String num2) {
        int len = Math.max(num1.length(), num2.length());
        int[] a = new int[len];
        int[] b = new int[len];
        int[][] res = new int[len][2 *len];
        int[] ret = new int[2 * len + 1];
        for(int i = len -1; i >= 0; i--){
            if(num1.length() + i - len >= 0)
                a[i] = num1.charAt( num1.length() + i - len) -'0';
            if(num2.length() + i - len >= 0)
                b[i] = num2.charAt( num2.length() + i - len) -'0';
        }
        for(int i = len -1 ; i >= 0 ;i--){
            int t = b[i];
            int lef = 0;
            for(int j = len -1 ; j >= 0 ;j--){
                res[len - 1 - i][j + i + 1] = (a[j] * t + lef) % 10;
                lef =  (a[j] * t + lef) /10;
            }
            res[len - 1 -i][i] = lef;
        }
        int t = 0;
        for(int i = 2* len - 1;i >= 0; i--){
            int subSum = 0;
            for(int j = 0;j < len ;j++){
                subSum += res[j][i];
            }
            ret[i + 1] = (t + subSum) %10;
            t = (t + subSum) / 10;
        }
        String str = "";
        int i = 0;
        while (i < ret.length && ret[i] == 0)
            i++;
        for(;  i < ret.length; i++){
            str += ret[i];
        }
        return str;
    }
}
