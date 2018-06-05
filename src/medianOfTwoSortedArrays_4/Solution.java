package medianOfTwoSortedArrays_4;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;
        int m = nums1.length;
        int n = nums2.length;
        if ((m + n) % 2 == 0) {

        } else {

        }
        System.out.println("median = " + median);
        return median;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};
        solution.findMedianSortedArrays(arr1, arr2);
    }
}
