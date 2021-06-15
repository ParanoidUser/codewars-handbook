interface Kata {
  static String helpZoom(int[] key) {
    for (var i = 0; i < key.length / 2; i++) {
      if (key[i] != key[key.length - 1 - i]) {
        return "No";
      }
    }
    return "Yes";
  }
}
