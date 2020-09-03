interface Solution {
  static String insertDash(int num) {
    return ("" + num).replaceAll("[13579](?=[13579])", "$0-");
  }
}
