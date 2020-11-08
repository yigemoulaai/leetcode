package easy;

import Fault.maxProfitAssignment;
import org.junit.Test;

public class maxProfitAssignmentTest {

    @Test
    public void maxProfitAssignment() {
        int[] difficulty={2,4,6,8,10};
        int[] profit={10,15,25,30,35};
        int[] worker={4,5,6,7};
        System.out.println(new maxProfitAssignment().maxProfitAssignment(difficulty,profit,worker));
    }
}