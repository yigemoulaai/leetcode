package easy;
/*给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。
你可以按任意顺序返回答案。
*/
import java.util.ArrayList;
import java.util.List;

public class commonChars {
    public List<String> commonChars(String[] A) {
        if(A.length==0)
            return null;
        List<String> list=new ArrayList<>();
        int[][] count=new int[A.length][26];
        int[] min=new int[26];
        for(int i=0;i<A.length;i++)
        {
            char[] s=A[i].toCharArray();
            for(int j=0;j<A[i].length();j++)
            {
                int k=s[j]-'a';
                count[i][k]++;
            }  }
            for(int j=0;j<26;j++)
            {
                min[j]=Integer.MAX_VALUE;
                for(int i=0;i<A.length;i++)
                {
                    if(min[j]>count[i][j])
                        min[j]=count[i][j];
                }
            }
            for(int i=0;i<26;i++)
            {
                System.out.println(min[i]);
                if(min[i]!=0)
                {
                    for(int j=0;j<min[i];j++)
                    {
                        list.add(String.valueOf((char)(i+'a')));
                    }

                }
            }

            return  list;
    }
}
