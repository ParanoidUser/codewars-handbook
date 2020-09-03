interface Dinglemouse {
  static double stackHeight2d(int layers) {
    return layers > 0 ? .86602 * --layers + 1 : 0;
  }
}
