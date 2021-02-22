interface DivBy9 {
  static boolean check(String ns) {
    return ns.chars().reduce(0, (s, c) -> s + c - 48) % 9 == 0;
  }
}
