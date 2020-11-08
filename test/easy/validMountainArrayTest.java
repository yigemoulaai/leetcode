package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class validMountainArrayTest {

    @Test
    public void validMountainArray() {
        int[] A={0,3,2,1};
        System.out.println(new validMountainArray().validMountainArray(A));
    }
}