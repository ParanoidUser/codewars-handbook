interface Kata {
  static int multiply(int number) {
    return number * (int) Math.pow(5, (int) (Math.log10(Math.abs(number)) + 1));
  }
}