package DataStructure.Day3;

import java.util.*;

public class TwoArraysIntersection {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5, 9, 8};
        int[] nums2 = {9, 4, 9, 8, 4};

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>(nums1.length);
        Map<Integer, Integer> map2 = new HashMap<>(nums2.length);
        for (int j : nums1) {
            if (map1.containsKey(j)) {
                map1.put(j, map1.get(j) + 1);
            } else {
                map1.put(j, 1);
            }
        }
        for (int j : nums2) {
            if (map2.containsKey(j)) {
                map2.put(j, map2.get(j) + 1);
            } else {
                map2.put(j, 1);
            }
        }

        if (map1.size() < map2.size()) {
            for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
                if (map2.containsKey(entry.getKey()))
                    entry.setValue(entry.getValue() + map2.get(entry.getKey()) * 10_000);
            }
        } else {
            for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
                if (map1.containsKey(entry.getKey()))
                    entry.setValue(entry.getValue() + map1.get(entry.getKey()) * 10_000);
            }
        }

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry :
                (map1.size() < map2.size()) ? map1.entrySet() : map2.entrySet()) {
            int count = Math.min(entry.getValue() % 10_000, entry.getValue() / 10_000);
            for (int i = 0; i < count; i++) {
                list.add(entry.getKey());
            }
        }

        int[] nums = new int[list.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }

        return nums;
    }
}
