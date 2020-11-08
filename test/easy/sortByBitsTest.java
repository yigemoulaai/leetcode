package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class sortByBitsTest {

    @Test
    public void sortByBits() {
        int[] arr={1111,7644,1107,6978,8742,1,7403,7694,9193,4401,377,8641,5311,624,3554,6631};
        System.out.println(new sortByBits().sortByBits(arr));
    }
}