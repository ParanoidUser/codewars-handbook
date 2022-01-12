interface Kata {
  static Integer prevMultOfThree(Integer n) {
    return n % 3 == 0 ? n : n > 10 ? prevMultOfThree(n / 10) : null;
  }
}