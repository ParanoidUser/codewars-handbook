interface Kata {
  static int getDistance(int age, int initialHR, double speed) {
    return (int) Math.round(speed * (
        Math.max(0, 198 - .9 * age - Math.max(initialHR, 176 - .8 * age)) / .5 +
        Math.max(0, 176 - .8 * age - Math.max(initialHR, 132 - .6 * age)) / .25 +
        Math.max(0, 132 - .6 * age - Math.max(initialHR, 44 - .2 * age)) / .125));
  }
}