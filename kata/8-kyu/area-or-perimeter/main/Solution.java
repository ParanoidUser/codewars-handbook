interface Solution {
  static int areaOrPerimeter(int l, int w) {
    return l == w ? l * w : 2 * (l + w);
  }
}
