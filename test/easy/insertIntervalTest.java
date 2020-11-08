package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class insertIntervalTest {

    @Test
    public void insert() {
        int[][] ints={{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] neIn={4,8};
        System.out.println(new insertInterval().insert(ints,neIn));
    }
}