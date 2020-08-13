interface Movie {
  static int movie(int card, int ticket, double perc) {
    int n = 0;
    double b = card;
    while (ticket * n <= Math.ceil(b)) {
      b += ticket * Math.pow(perc, ++n);
    }
    return n;
  }
}
