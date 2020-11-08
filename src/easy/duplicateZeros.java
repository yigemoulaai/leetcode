package easy;
/*给你一个长度固定的整数数组 arr，请你将该数组中出现的每个零都复写一遍，并将其余的元素向右平移。
注意：请不要在超过该数组长度的位置写入元素。*/
public class duplicateZeros {
    public void duplicateZeros(int[] arr) {
        int i=0,j=0;
        for(i=arr.length;i>0;i--)
        {
            if(arr[i]==0)
            {
                for(j=arr.length-1;j>i;j--)
                    arr[j]=arr[j-1];
            }
        }
        return;
    }
}
