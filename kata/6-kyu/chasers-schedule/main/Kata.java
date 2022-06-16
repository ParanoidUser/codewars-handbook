interface Kata {
  static int solution(int speed, int time) {
    int boost = Math.min(speed / 3 + 1, (time + 1) / 2);
    return (time + boost) * speed - boost * (boost - 1) * 3 / 2;
  }
}