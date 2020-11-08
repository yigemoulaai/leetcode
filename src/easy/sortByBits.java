package easy;

public class sortByBits {
    public int[] sortByBits(int[] arr) {
        int[] flag=new int[arr.length];
        int[] flag1=new int[arr.length];
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int t=arr[j];
                    arr[j]=arr[i];
                    arr[i]=t;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            flag[i]=Integer.bitCount(arr[i]);
        }
        flag[arr.length-1]=Integer.bitCount(arr[arr.length-1]);
        int k=0;
        int n=0;
        int i=0;
        while(k!=arr.length)
        {
                if(flag[i]==n)
                {
                    flag1[k++]=arr[i];
                }
                if(i==arr.length-1)
                {
                    i=-1;
                    n++;
                }
                i++;

        }
            return flag1;
    }


    }

