package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class buildTreeTest {

    @Test
    public void buildTree() {
        int[] a={9,3,15,20,7};
        int[] b={9,15,7,20,3};
        System.out.println(new buildTree().buildTree1(a,b).toString());
    }
}