interface Validate {
  static boolean validate(String n) {
    boolean[] flag = {(n.length() & 1) == 1};
    return n.chars().map(c -> c - 48).map(num -> (flag[0] ^= true) ? (2 * num  - 1) % 9 + 1 : num).sum() % 10 == 0;
  }
}
