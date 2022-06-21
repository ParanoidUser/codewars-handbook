interface FizzBuzz {
  static String convert(int i) {
    if (i % 15 == 0) {
      return "fizz buzz";
    }
    if (i % 5 == 0) {
      return "buzz";
    }
    if (i % 3 == 0) {
      return "fizz";
    }
    return i + "";
  }
}