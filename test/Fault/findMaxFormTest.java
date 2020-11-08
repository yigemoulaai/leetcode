package Fault;

import org.junit.Test;

import static org.junit.Assert.*;

public class findMaxFormTest {

    @Test
    public void findMaxForm() {
        String[] s={"10","0001","111001","1","0"};
        System.out.print(new findMaxForm().findMaxForm(s,5,3));
    }
}