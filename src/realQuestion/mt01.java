package AlwaysCode;

import java.util.Scanner;

/**
 * @Author ACER
 * @Date:2022/3/12
 */
public class mt01 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        int[] no =new int[n];
        for(int i =0 ; i  < n ;i++)
        {
            no[i] = scanner.nextInt();
        }
        for(int i =0 ; i  < n ;i++){
            if(func(no[i]))
                System.out.println("no");
            else System.out.println("yes");
        }

    }

    private static boolean func(int tmp) {
        int count =0;
        boolean flag = true;
        if(tmp %11 ==0)
            flag =false;
        while (tmp !=0){
            if(tmp%10 ==1){
                count++;
            }
            tmp =tmp /10;
        }
        if(count >= 2)
            flag = false;
        return flag;
    }
}
