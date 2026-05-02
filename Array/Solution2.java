package leetcode.Array;

import java.util.Arrays;

class Solution2 {
    public static void main(String args[]) {
        double d = findMedianSortedArrays(new int[]{1,23,3}, new int[]{2,4,3});
        System.out.println("\nMedian: " + d);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] temp = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            temp[i] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            temp[nums1.length + i] = nums2[i];
        }

        // Sort before finding median
        Arrays.sort(temp);

        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }

        int m = temp.length / 2;

        if (temp.length % 2 == 0) {
            return (temp[m - 1] + temp[m]) / 2.0;
        }

        return temp[m];
    }
}