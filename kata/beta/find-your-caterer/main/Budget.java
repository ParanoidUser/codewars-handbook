interface Budget {
  static int find_caterer(int budget, int people) {
    return people < 1 || budget < 15 * people ? -1 :
            (people > 60 ? 24 : 30) * people <= budget ? 3 :
                    20 * people <= budget ? 2 : 1;
  }
}