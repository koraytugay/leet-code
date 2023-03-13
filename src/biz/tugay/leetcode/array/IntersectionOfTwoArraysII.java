package biz.tugay.leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/intersection-of-two-arrays-ii
public class IntersectionOfTwoArraysII {

  public int[] intersect(int[] nums1, int[] nums2) {
    List<Integer> intersection = new ArrayList<>();
    Map<Integer, Integer> valueCountMap = new HashMap<>();

    for (int num : nums1) {
      Integer currentValue = valueCountMap.putIfAbsent(num, 1);
      if (currentValue != null) {
        valueCountMap.put(num, currentValue + 1);
      }
    }

    for (int num : nums2) {
      if (!valueCountMap.containsKey(num)) {
        continue;
      }
      if (valueCountMap.get(num) == 0) {
        continue;
      }
      intersection.add(num);
      valueCountMap.put(num, valueCountMap.get(num) - 1);
    }

    int[] intersectionArr = new int[intersection.size()];
    for (int i = 0; i < intersectionArr.length; i++) {
      intersectionArr[i] = intersection.get(i);
    }

    return intersectionArr;
  }
}
