package data_structure.day_3;

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
        Map<Integer, Integer> map1 = arrayToMap(nums1);
        Map<Integer, Integer> map2 = arrayToMap(nums2);
        List<Integer> list = intersectListFromTwoMaps(map1, map2);

        return list.stream().mapToInt(i -> i).toArray();
    }

    private static Map<Integer, Integer> arrayToMap(int[] numbers) {
        Map<Integer, Integer> map1 = new HashMap<>(numbers.length);
        for (int j : numbers) {
            if (map1.containsKey(j)) {
                map1.put(j, map1.get(j) + 1);
            } else {
                map1.put(j, 1);
            }
        }
        return map1;
    }

    private static List<Integer> intersectListFromTwoMaps(Map<Integer, Integer> map1, Map<Integer, Integer> map2) {
        return map1.size() < map2.size() ? listFromMaps(map1, map2) : listFromMaps(map2, map1);
    }

    private static List<Integer> listFromMaps(Map<Integer, Integer> smallMap, Map<Integer, Integer> largeMap) {
        List<Integer> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : smallMap.entrySet()) {
            if (largeMap.containsKey(entry.getKey())) {
                int number = entry.getKey();
                int count = Math.min(entry.getValue(), largeMap.get(number));
                for (int i = 0; i < count; i++) {
                    list.add(number);
                }
            }
        }
        return list;
    }
}
