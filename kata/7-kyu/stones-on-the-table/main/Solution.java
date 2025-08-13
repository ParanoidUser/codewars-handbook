interface Solution {
  static int solve(String stones) {
    return stones.length() - stones.replaceAll("(.)\\1+", "$1").length();
  }
}