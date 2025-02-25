interface Kata {
  static int sumDigits(int number) {
    return (Math.abs(number) + "").chars().reduce(0, (s, i) -> s + i - 48);
  }
}