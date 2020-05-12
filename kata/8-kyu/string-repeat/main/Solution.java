interface Solution {
  static String repeatStr(int repeat, String string) {
    return repeat < 0 ? "" : string.repeat(repeat);
  }
}
