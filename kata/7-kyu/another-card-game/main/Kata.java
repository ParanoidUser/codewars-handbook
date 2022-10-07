interface Kata {
  static boolean game(int[] frank, int[] sam, int[] tom) {
    return frank[2] > Math.max(sam[0], tom[0]) && frank[3] > Math.max(sam[1], tom[1]);
  }
}