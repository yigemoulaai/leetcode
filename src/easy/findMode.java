package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class findMode {
    List<Integer> list = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        if (root == null)
            return null;
        travel(root);
         int max = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (!hashMap.containsKey(list.get(i))) {
                hashMap.put(list.get(i), 1);

            } else {
                hashMap.replace(list.get(i), hashMap.get(list.get(i)) + 1);
            }
            if (hashMap.get(list.get(i)) > max)
                max = hashMap.get(list.get(i));
        }
        final  int t=max;
        hashMap.forEach((key, value) -> {
            if (value == t) {
              list2.add(Integer.valueOf(value)) ;
            }
        } );
        int[] num=new int[list2.size()];
        for(int i=0;i<num.length;i++)
        {
            num[i]=list2.get(i);
        }
        return num;
    }


    private void travel(TreeNode root) {
        if(root==null)
            return;
        list.add(root.val);
        travel(root.left);
        travel(root.right);
    }
}
