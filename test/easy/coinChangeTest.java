package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class coinChangeTest {

    @Test
    public void coinChange() {
        int[] s={2};
        System.out.println(new coinChange().coinChange(s,3));
    }
}