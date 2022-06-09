interface Kata {
  static int travel(int totalTime, int runTime, int restTime, int speed) {
    restTime += runTime;
    return totalTime / restTime * speed * runTime + speed * Math.min(totalTime % restTime, runTime);
  }
}
