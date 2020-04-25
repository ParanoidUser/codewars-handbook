interface FizzBuzz {
  static String convert(int i) {
    return i % 15 == 0 ? "fizz buzz" : i % 3 == 0 ? "fizz" : i % 5 == 0 ? "buzz" : i + "";
  }
}