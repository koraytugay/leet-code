package biz.tugay.leetcode.array;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum
public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> valueIndexMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int currentValue = nums[i];
      int requiredVal = target - currentValue;
      if (valueIndexMap.containsKey(requiredVal)) {
        return new int[]{i, valueIndexMap.get(requiredVal)};
      }
      valueIndexMap.put(currentValue, i);
    }
    return null;
  }
}
