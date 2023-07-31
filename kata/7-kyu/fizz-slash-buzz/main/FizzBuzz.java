interface FizzBuzz {
  static int[] solution(int n) {
    int c = --n / 15;
    return new int[]{n / 3 - c, n / 5 - c, c};
  }
}