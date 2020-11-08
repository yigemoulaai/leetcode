package easy;

public class smallerNumbersThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        int[] ca=new int[nums.length];
        for(int i=0;i<nums.length-1;i++)
            ca[i]=nums[i];
        for(int i=0;i<nums.length-1;i++)
            for(int j=i+1;j<nums.length;j++)
            {
                if(ca[i]>ca[j])
                {
                    int c=ca[i];
                    ca[i]=ca[j];
                    ca[j]=c;
                }
            }
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==ca[j])
                {
                    ans[i]=j+1;
                    break;
                }
            }
            System.out.println(ca[i]);
        }
        return ans;
    }
}
