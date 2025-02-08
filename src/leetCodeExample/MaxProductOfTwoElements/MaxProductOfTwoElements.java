package leetCodeExample.MaxProductOfTwoElements;

public class MaxProductOfTwoElements {
    public static int maxProduct(int[] nums) {
        int maxIndex = 0;
        int maxValue1 = 0;
        int maxValue2 = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] > maxValue1) {
                maxValue1 = nums[i];
                maxIndex = i;
            }
        }
        for(int k=0; k<nums.length; k++) {
            if(nums[k] > maxValue2 && k != maxIndex) {
                maxValue2 = nums[k];
            }
        }
        return (maxValue1 -1) * (maxValue2 -1);
    }

    public static void main(String[] args) {
        int[] nums ={3,7};
        System.out.println(maxProduct(nums));
    }






}
