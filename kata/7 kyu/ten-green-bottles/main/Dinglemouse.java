class Dinglemouse {
  private static String[] COUNT = {"No", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

  static String tenGreenBottles(int n) {
    var lyrics = new StringBuilder();
    while (n > 0) {
      lyrics.append(COUNT[n] + " green bottle" + (n > 1 ? "s" : "") + " hanging on the wall,\n");
      lyrics.append(COUNT[n] + " green bottle" + (n > 1 ? "s" : "") + " hanging on the wall,\n");
      lyrics.append((n > 1 ? "And if" : "If that") + " one green bottle should accidentally fall,\n");
      lyrics.append("There'll be " + COUNT[n - 1].toLowerCase() + " green bottle" + (n == 2 ? "" : "s") + " hanging on the wall.\n");
      lyrics.append(--n > 0 ? "\n" : "");
    }
    return lyrics.toString();
  }
}
