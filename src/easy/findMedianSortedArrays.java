package easy;

import javax.lang.model.util.ElementScanner6;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;

public class findMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> nums3 = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        double ave=0;
        if(nums1.length==0&& nums2.length==0)
        {
            ave=0;
        }
        else  if(nums1.length==0&&nums2.length!=0)
        {
            for(int i1=0;i1<nums2.length;i1++)
                nums3.add(nums2[i1]);
        }
        else if(nums1.length!=0&&nums2.length==0)
        {
            for(int i2=0;i2<nums1.length;i2++)
                nums3.add(nums1[i2]);
        }
        else {
            for (; k < nums1.length + nums2.length; ) {
                if (nums1[i] <= nums2[j]) {
                    nums3.add(nums1[i]);
                    k++;
                    if (nums1.length - 1 > i) i++;
                        // System.out.println(i);
                    else {
                        for (; j < nums2.length; j++) {
                            nums3.add(nums2[j]);
                            k++;
                        }
                    }

                } else {
                    nums3.add(nums2[j]);
                    k++;
                    //System.out.println("nums2[]");
                    if (nums2.length - 1 > j) j++;
                    else {
                        for (; i < nums1.length; i++) {
                            nums3.add(nums1[i]);
                            k++;
                        }
                    }
                }
                // System.out.println(nums3.size());
            }
        }
        for(i=0;i<nums3.size();i++)
            System.out.println(nums3.get(i));
        if(nums3.size()!=0)
        {
            if (nums3.size() % 2 == 0 ) {
                ave = (nums3.get(nums3.size() / 2) + nums3.get((nums3.size() / 2) - 1)) / 2.0;
            }
            else
                ave = nums3.get((nums3.size() - 1) / 2);
        }

        return ave;
    }
}
