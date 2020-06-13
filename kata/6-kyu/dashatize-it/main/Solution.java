interface Solution {
  static String dashatize(int num) {
    return String.join("-", (num + "").substring(num < 0 ? 1 : 0).split("(?=[13579])|(?<=[13579])"));
  }
}
