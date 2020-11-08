package easy;
/*
* 给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则返回 false。
让我们回顾一下，如果 A 满足下述条件，那么它是一个山脉数组：*/
public class validMountainArray {
    public boolean validMountainArray(int[] A) {
        boolean flag=true;
        int max=Integer.MIN_VALUE;
        int maxi=-1;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max) {
                max=A[i];
                maxi=i;

            }
        }
        System.out.println(maxi);
        if(A.length==2||maxi==A.length-1||A.length==0)
            return false;
        for(int i=0;i<A.length;i++)
        {
            if(i<maxi) {
                if(A[i]>=A[i+1])
                    return  false;

            }
            if(i>maxi) {
                if(A[i]>=A[i-1])
                    return false;

            }
        }
        return flag;

    }
}
