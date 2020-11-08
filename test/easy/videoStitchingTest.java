package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class videoStitchingTest {

    @Test
    public void videoStitching() {
        int[][] ints={{0,2},{4,6},{2,6},{6,10}};
        System.out.println(new videoStitching().videoStitching(ints,10));
    }
}