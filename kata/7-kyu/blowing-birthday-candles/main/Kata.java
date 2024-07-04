interface Kata {
  static int blowCandles(String str) {
    int[] blows = new int[4];
    for (char c : str.toCharArray()) {
      blows[0] = Math.max(c - 48 - blows[1] - blows[2], 0);
      blows[2] = blows[1];
      blows[1] = blows[0];
      blows[3] += blows[0];
    }
    return blows[3];
  }
}