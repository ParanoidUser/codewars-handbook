interface Compare {
  static int comparePowers(int[] n1, int[] n2) {
    return Double.compare(Math.log(n2[0]) * n2[1], Math.log(n1[0]) * n1[1]);
  }
}