interface Kata {
  static String evenOrOdd(String str) {
    int t = str.chars().reduce(0, (s, c) -> s + (c % 2 > 0 ? -(c - 48) : (c - 48)));
    return t == 0 ? "Even and Odd are the same" : t > 0 ? "Even is greater than Odd" : "Odd is greater than Even";
  }
}