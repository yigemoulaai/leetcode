package easy;

public class isPalindrome {
    public  boolean isPalindrome(int x) {
        String sx = String.valueOf(x);
        char[] chars = sx.toCharArray();
        boolean flag = true;
        int i = 0;
        int j = sx.length()-1;
        while (i < j) {
            //System.out.println(chars[i]+"   "+chars[j]);
            if (chars[i] == chars[j]) {
                i++;
                j--;
            } else {
               // System.out.println("12");
                flag = false;
                break;
            }
        }

        {

        }return flag;
    }
}
