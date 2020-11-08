package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class sortedSquaresTest {

    @Test
    public void sortedSquares() {
        int[] n={-4,-3,-3,-2,2};
       // for(int i=0;i<n.length;i++)
        System.out.println(new sortedSquares().sortedSquares(n));
    }
}