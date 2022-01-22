package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Author ACER
 * @Date:2022/1/22
 */
public class removePalindromeSub {
    public int removePalindromeSub(String s) {
        char[] chs =s.toCharArray();
        int left =0;
        int res =0;
        if(isPalindrom(left, s.length()-1, chs))
        {
            return 1;
        }
        return 2;
    }

    private boolean isPalindrom(int left, int right, char[] s) {
        while (left < right && s[left] == s[right]){
            left++;
            right--;
        }
        if(left >= right){
            return true;
        }
        return false;
    }
}
