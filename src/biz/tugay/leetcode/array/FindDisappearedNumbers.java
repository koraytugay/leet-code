package biz.tugay.leetcode.array;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array
public class FindDisappearedNumbers {

  public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> disappearedNumbers = new ArrayList<>();

    boolean[] app = new boolean[nums.length + 1];
    app[0] = true;

    for (int num : nums) {
      app[num] = true;
    }

    for (int i = 0; i < app.length; i++) {
      if (!app[i]) {
        disappearedNumbers.add(i);
      }
    }

    return disappearedNumbers;
  }
}
