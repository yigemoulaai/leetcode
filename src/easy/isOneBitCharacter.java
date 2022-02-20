package easy;

/**
 * @Author ACER
 * @Date:2022/2/20
 */
public class isOneBitCharacter {
    public boolean isOneBitCharacter(int[] bits) {
        int i =0;
        while(i < bits.length -1){
            if(bits[i] == 1)
            {
                i = i+2;
            }else{
                i = i+1;
            }
        }
        if(i == bits.length-1 && bits[i] ==0 ){
            return true;
        }
        return false;
    }
}
