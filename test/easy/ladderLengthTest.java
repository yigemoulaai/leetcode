package easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ladderLengthTest {

    @Test
    public void ladderLength() {
        String[] strings={"hot","dot","dog","lot","log","cog"};
        List<String> list=new ArrayList<>();
        Collections.addAll(list,strings);
        String begin="hit";
        String end="cog";
        System.out.println(new ladderLength().ladderLength(begin,end,list));
    }
}