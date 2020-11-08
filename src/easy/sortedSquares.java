package easy;

public class sortedSquares {
    public int[] sortedSquares(int[] A) {
        int[] sqa=new int[A.length];
        boolean[] sq=new boolean[A.length];
        int min=Integer.MAX_VALUE;
        int mini=0,k=0;
        if(A.length==1)
        {
            sqa[0]=(int)Math.pow(A[0],2);
            return sqa;
        }
        for(int i=0;i<A.length;i++)
        {
            min=Integer.MAX_VALUE;
           // mini=i;
             for(int j=0;j<A.length;j++)
                {
                    if(Math.abs(A[j])<Math.abs(min)&&sq[j]==false)
                    {
                        min=A[j];
                        mini=j;
                      // System.out.println(sq[j]);
                    }
                   /* else if(Math.abs(A[j])==Math.abs(min)&&sq[j]==false)
                    {
                        mini=j;
                    }*/
                }
                sq[mini]=true;
                sqa[k++]=(int)Math.pow(A[mini],2);
                System.out.println(sq[mini]);
            }
        return sqa;
    }
}
