package leetCodeExample.Median;

import java.util.Arrays;

public class Median {
    public static double median(int[] nums1, int[] nums2) {
        int[] newnums = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            newnums[i] = nums1[i];
        }
        for (int i = nums1.length; i < newnums.length; i++) {
            for(int k = 0; k < nums2.length; k++) {
                newnums[nums1.length + k] = nums2[k];
            }
        }
        Arrays.sort(newnums);
        double medianOfNums = 0;
        if(newnums.length % 2 != 0){
            medianOfNums = newnums[newnums.length / 2];
        }else{
            int leftIndex = newnums.length / 2;
            int rightIndex = newnums.length / 2 - 1;
            medianOfNums = (double)(newnums[leftIndex] + newnums[rightIndex]) / 2;
        }
        return medianOfNums;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,4,5,7,9,16}, nums2 = {33,8,17};
        System.out.println(median(nums1, nums2));
    }
}
