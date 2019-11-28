class Kata {
  static int findGCF(int num1, int num2) {
    return num2 == 0 ? num1 : findGCF(num2, num1 % num2);
  }
}
