interface Movie {
  static int movie(int card, int ticket, double perc) {
    var n = 0;
    double b = card;
    while (ticket * n <= Math.ceil(b)) {
      b += ticket * Math.pow(perc, ++n);
    }
    return n;
  }
}
