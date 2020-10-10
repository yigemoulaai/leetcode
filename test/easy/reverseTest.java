package easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class reverseTest {

    @Test
    public void reverse() {
        List<List<LinkedNode>> lists=new ArrayList<>();
        lists.get(0).add(new LinkedNode(1));
        System.out.println(lists.get(0).size());
    }
}