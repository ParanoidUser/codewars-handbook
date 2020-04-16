class Dinglemouse {
  private static final String[] COUNT = {"No", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", " green bottle"};

  static String tenGreenBottles(int n) {
    var lyrics = new StringBuilder();
    while (n > 0) {
      lyrics.append(COUNT[n]).append(COUNT[11]).append(n > 1 ? "s" : "").append(" hanging on the wall,\n");
      lyrics.append(COUNT[n]).append(COUNT[11]).append(n > 1 ? "s" : "").append(" hanging on the wall,\n");
      lyrics.append(n > 1 ? "And if" : "If that").append(" one green bottle should accidentally fall,\n");
      lyrics.append("There'll be ").append(COUNT[n - 1].toLowerCase()).append(COUNT[11]).append(n == 2 ? "" : "s").append(" hanging on the wall.\n");
      lyrics.append(--n > 0 ? "\n" : "");
    }
    return lyrics.toString();
  }
}
