package easy;

public class maxTurbulenceSize {
    public int maxTurbulenceSize(int[] A) {
        int length=A.length;
        int ans=1;
        int anchor=0;
        for (int i = 1; i < length; ++i) {
            int c = A[i-1]-A[i];
            if (i == length-1 || c * (A[i]- A[i+1]) <0) {
                if (c != 0) ans = Math.max(ans, i - anchor + 1);
                anchor = i;
            }
        }

    return ans;
    }
}
