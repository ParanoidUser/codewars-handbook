interface NoIfsNoButs {
  static String noIfsNoButs(int a, int b) {
    return a + " is " + switch (Integer.compare(a, b)) {
      case -1 -> "smaller than ";
      case 1 -> "greater than ";
      default -> "equal to ";
    } + b;
  }
}