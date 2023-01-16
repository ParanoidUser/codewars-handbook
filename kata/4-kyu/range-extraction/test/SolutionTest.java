import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("-3--1,2,10,15,16,18-20", Solution.rangeExtraction(new int[]{-3, -2, -1, 2, 10, 15, 16, 18, 19, 20}));
    assertEquals("-6,-3-1,3-5,7-11,14,15,17-20", Solution.rangeExtraction(new int[]{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}));
    assertEquals("-19,-18,-15--12,-9,-7,-5,-2,0,2,5,8,11,14,17-19,22,24,27,29,32,33,35,38,40,43,45,46", Solution.rangeExtraction(new int[]{-19, -18, -15, -14, -13, -12, -9, -7, -5, -2, 0, 2, 5, 8, 11, 14, 17, 18, 19, 22, 24, 27, 29, 32, 33, 35, 38, 40, 43, 45, 46}));
  }
}