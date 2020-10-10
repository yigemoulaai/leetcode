package easy;

import algorithm.Insertion;
import algorithm.Merge;
import com.sun.deploy.util.ArrayUtil;
import org.junit.Test;


public class InsertionTest {

    @Test
    public void sort() {
        String s="leetcode is very good";
       // char[] charArray = s.toCharArray();
        Character[] characters= s.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
      // Insertion.sort2(characters);
        Merge.func(characters);
        for (Character char1:characters) {
            System.out.println(char1.toString());
        }

    }
}