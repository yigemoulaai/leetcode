package easy;
import java.util.*;
/*给定两个单词（beginWord 和 endWord）和一个字典，找到从 beginWord 到 endWord 的最短转换序列的长度。转换需遵循如下规则：
每次转换只能改变一个字母。
转换过程中的中间单词必须是字典中的单词。
* */
public class ladderLength {
    /*广度优先搜索  利用set解决数据重复的问题 已知在set中找能转化的值并且加入队列
    每一层遍历完就加一 直到找到目标值 返回层数+1
    否则就返回0
    * */
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set=new HashSet<>(wordList);
        List<String> list=new ArrayList(set);
        if(set.size()==0||!set.contains(endWord))
        return 0;
        int count=0;
        Queue<String> queue=new LinkedList<>();
        boolean[] view=new boolean[set.size()];
        queue.add(beginWord);
        while(!queue.isEmpty())
        {
            int size=queue.size();
            while(size!=0)
            {
                    String s=queue.peek();
                    if(s.equals(endWord))
                        return count+1;
                    for(int i=0;i<list.size();i++)
                    {
                        if(!view[i]&&checkOk(s,list.get(i)))
                        {
                            queue.add(list.get(i));
                            view[i]=true;
                        }
                    }
                    queue.poll();
                    size--;
            }
            count++;

        }
        return 0;
        }

    private boolean checkOk(String s, String t) {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=t.charAt(i))
            {
                count++;
                if(count>1)
                    return false;
            }
        }
        return true;
    }

}

