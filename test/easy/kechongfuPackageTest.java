package easy;

import org.junit.Test;

public class kechongfuPackageTest {

    @Test
    public void maxTurbulenceSize() {
        int[] m={1,5,8,9,10,13,17,20,24,30};
       System.out.println(new kechongfuPackage().maxTurbulenceSize(m,6)) ;
    }
}