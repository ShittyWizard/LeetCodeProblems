package medianOfTwoSortedArrays_4;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median;
        int m = nums1.length;
        int n = nums2.length;
        ArrayList<Integer> numsResult = new ArrayList<>();
        for (int i = 0; i < (m + n); i++) {
            if (i < m) {
                numsResult.add(nums1[i]);
            }
            if (i < n) {
                numsResult.add(nums2[i]);
            }
        }
        Collections.sort(numsResult);
        System.out.println("numsResult = " + numsResult);
        if ((m + n) % 2 == 0) {
            median = (numsResult.get((m + n) / 2 - 1) + numsResult.get((m + n) / 2)) / 2.;
            System.out.println("median = " + numsResult.get((m + n) / 2 - 1) + " " + numsResult.get((m + n) / 2) + " / 2");
        } else {
            median = numsResult.get((m + n) / 2);
        }
        System.out.println("median = " + median);
        return median;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4, 5};
        solution.findMedianSortedArrays(arr1, arr2);
    }
}
