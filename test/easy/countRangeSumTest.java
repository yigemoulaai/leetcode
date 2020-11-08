package easy;

import Fault.countRangeSum;
import org.junit.Test;

public class countRangeSumTest {

    @Test
    public void countRangeSum() {
        int[] num={-2,5,-1,7};
        int low=-2;
        int up=2;
        System.out.println(new countRangeSum().countRangeSum(num,low,up));
    }
}