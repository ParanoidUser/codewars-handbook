interface Validate {
  static boolean validate(String n) {
    var flag = new boolean[]{(n.length() & 1) == 1};
    return n.chars().map(c -> c - 48).map(num -> {
      flag[0] ^= true;
      return flag[0] ? (2 * num  - 1) % 9 + 1 : num;
    }).sum() % 10 == 0;
  }
}
