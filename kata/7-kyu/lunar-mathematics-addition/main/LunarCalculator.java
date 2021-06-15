interface LunarCalculator {
  static long add(long number1, long number2) {
    long sum = 0;
    for (var i = 1; number1 > 0 || number2 > 0; number1 /= 10, number2 /= 10, i *= 10) {
      sum += i * Math.max(number1 % 10, number2 % 10);
    }
    return sum;
  }
}
