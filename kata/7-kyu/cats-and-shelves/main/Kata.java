interface Kata {
  static int solution(int start, int finish) {
    int distance = finish - start;
    return distance / 3 + distance % 3;
  }
}