package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class commonCharsTest {

    @Test
    public void commonChars() {
        String[] a={"bella","label","roller"};
        System.out.println(new commonChars().commonChars(a));
    }
}