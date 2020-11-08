package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class canPartitionTest {

    @Test
    public void canPartition() {
        int[] num={2,2,1,1};
        System.out.println(new canPartition().canPartition(num));
    }
}