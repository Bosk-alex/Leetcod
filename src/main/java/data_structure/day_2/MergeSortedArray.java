package data_structure.day_2;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0;
        int n = 1;

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
        }
        if (n == 0) {
            return;
        }

        int ind1 = m - 1;
        int ind2 = n - 1;
        for (int i = m + n -1; i > - 1; i--) {
            if (ind2 < 0) {
                return;
            } else if (ind1 < 0) {
                nums1[i] = nums2[ind2];
                ind2--;
            } else {
                if (nums1[ind1] >= nums2[ind2]) {
                    nums1[i] = nums1[ind1];
                    ind1--;
                } else {
                    nums1[i] = nums2[ind2];
                    ind2--;
                }
            }
        }
    }
}
