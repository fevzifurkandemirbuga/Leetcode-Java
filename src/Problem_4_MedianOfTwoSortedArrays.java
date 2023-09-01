import java.util.ArrayList;
import java.util.Collections;

public class Problem_4_MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len=-1;
        ArrayList<Integer> list = new ArrayList<>();
        while(len<nums1.length || len<nums2.length){
            len++;
            if(len<nums1.length){
                list.add(nums1[len]);
            }
            if(len<nums2.length) {
                list.add(nums2[len]);
            }

        }
        Collections.sort(list);
        if(list.size()%2==0){
            return (double) (list.get(list.size() / 2) + list.get(list.size() / 2 - 1)) /2;
        }
        return list.get(list.size()/2);
    }
}
