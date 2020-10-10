package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class PackageTest {

    @Test
    public void longestCommonPrefix() {
        String[] strings={"flower","flow","flight"};
        System.out.println(new Package().longestCommonPrefix(strings));
    }

    @Test
    public void gcd() {
       // System.out.println(Math.pow(3,14));
       // System.out.println(new Package().gcd(4782970,58));
        System.out.println("周期为"+new Package().zhouqi(3,85));
    }
}