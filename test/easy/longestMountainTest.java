package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class longestMountainTest {

    @Test
    public void longestMountain() {
        int[] a={2,3,3,2,0,2};
        System.out.println(new longestMountain().longestMountain(a));
    }
}