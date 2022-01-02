interface Kata {
  static String lastSurvivor(String letters, int[] coords) {
    var chars = new StringBuilder(letters);
    for (int i : coords) {
      chars.deleteCharAt(i);
    }
    return chars.toString();
  }
}
