interface HowManyPagesInABook {
  static int amountOfPages(int s) {
    return s > 38889 ? 9999 + (s - 38889) / 5 :
           s > 2889 ? 999 + (s - 2889) / 4 :
           s > 189 ? 99 + (s - 189) / 3 :
           s > 9 ? 9 + (s - 9) / 2 : s;
  }
}