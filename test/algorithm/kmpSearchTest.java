package algorithm;

import org.junit.Test;

public class kmpSearchTest {

    @Test
    public void kmpNext() {

        String s1="BBC ABCDAB ABCDABCD";
        String s2="ABCDABCD";
        int[] k=new kmpSearch().kmpNext(s2);
        if(new kmpSearch().kmpsearch(s1,s2)>=0)
        System.out.println("KMP匹配成功");
        else
            System.out.println("KMP匹配失败");
    }
}