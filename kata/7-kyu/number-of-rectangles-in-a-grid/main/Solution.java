class Solution {
  int numberOfRectangles(int m, int n) {
    return n * (n + 1) * m * (m + 1) / 4;
  }
}
