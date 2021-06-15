interface Dinglemouse {
  static String tenGreenBottles(int n) {
    var lyrics = new StringBuilder();
    var count = new String[]{"No", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", " green bottle"};
    while (n > 0) {
      lyrics.append(count[n]).append(count[11]).append(n > 1 ? "s" : "").append(" hanging on the wall,\n");
      lyrics.append(count[n]).append(count[11]).append(n > 1 ? "s" : "").append(" hanging on the wall,\n");
      lyrics.append(n > 1 ? "And if" : "If that").append(" one green bottle should accidentally fall,\n");
      lyrics.append("There'll be ").append(count[n - 1].toLowerCase()).append(count[11]).append(n == 2 ? "" : "s").append(" hanging on the wall.\n");
      lyrics.append(--n > 0 ? "\n" : "");
    }
    return lyrics.toString();
  }
}
