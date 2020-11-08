package easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class wordBreakTest {

    @Test
    public void wordBreak() {
        List<String> list=new ArrayList<>();
        list.add("leet");
        list.add("code");
        String s="leetcode";
        System.out.println(new wordBreak().wordBreak(s,list));
    }
}