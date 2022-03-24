package AlwaysCode;

/**
 * @Author ACER
 * @Date:2022/3/2
 */
//快速排序
 class BinarySort {
    public static void main(String[] args) {
        int[] nums ={1,3,4,5,2,6};
        binarySort(nums,0, nums.length -1);
        System.out.println("");
    }
    public static void binarySort(int[] nums, int left, int right)
    {
        int _left =left;
        int _right =right;
        if(left >= right)
            return;
        int tmp = nums[_left];
        while (left < right){
            while (left < right && nums[right] >= tmp){
                right--;
            }
            while (left < right && nums[left] <= tmp)
            {
                left++;
            }
            if(left < right){
                int t = nums[left];
                nums[left] =nums[right];
                nums[right] = t;
            }
        }
        nums[_left] = nums[left];  //三部交换法
        nums[left] = tmp;
        binarySort(nums,_left,left-1);
        binarySort(nums,left+1,_right);
    }
    private class T1{

    }

}
