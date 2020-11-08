package easy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hashSet=new LinkedHashSet<>();
        Set<Integer> hashSet1=new LinkedHashSet<>();
        for(int i=0;i<nums1.length;i++)
            {
                        hashSet.add(nums1[i]);
            }

            int k=0;
            for(int j=0;j<nums2.length;j++)
            {
                if(hashSet.contains(nums2[j]))
                  hashSet1.add(nums2[j]);

            }
            Iterator<Integer> iterator=hashSet1.iterator();
            int[] result=new int[hashSet1.size()];
       while(iterator.hasNext())
       {
           Integer x=iterator.next();
           result[k++]=x;
       }
       return result;
        }


    }

