interface Kata {
  static String crap(char[][] garden, int bags, int cap) {
    int poops = bags * cap;
    for (char[] bunch : garden) {
      for (char patch : bunch) {
        if (patch == 'D') {
          return "Dog!!";
        } else if (patch == '@') {
          poops--;
        }
      }
    }
    return poops < 0 ? "Cr@p" : "Clean";
  }
}