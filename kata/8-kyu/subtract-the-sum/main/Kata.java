class Kata {
  static String subtractSum(int n) {
    int sum = 0, num = n;
    while (num > 0) {
      sum += num % 10;
      num /= 10;
    }
    return (n - sum) % 9 > 0 ? null : "apple";
  }
}
