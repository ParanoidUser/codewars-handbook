class Tortoise {
  static int[] race(int v1, int v2, int g) {
    return v1 < v2 ? new int[] {(g = 3600 * g / (v2 - v1)) / 3600, g % 3600 / 60, g % 60} : null;
  }
}
