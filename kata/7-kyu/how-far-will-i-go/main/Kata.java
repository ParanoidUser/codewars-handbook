interface Kata {
  static int travel(int totalTime, int runTime, int restTime, int speed) {
      return totalTime / (restTime += runTime) * speed * runTime  + speed * Math.min(totalTime % restTime, runTime);
  }
}
