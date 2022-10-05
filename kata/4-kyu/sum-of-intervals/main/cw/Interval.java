package cw;

import java.util.Arrays;
import java.util.Comparator;

public interface Interval {
  static int sumIntervals(int[][] intervals) {
    int sum = 0;
    Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
    int maxEnd = Integer.MIN_VALUE;
    for (int[] interval : intervals) {
      if (interval[1] > maxEnd) {
        sum += interval[1] - Math.max(interval[0], maxEnd);
        maxEnd = interval[1];
      }
    }
    return sum;
  }
}