interface Finance {
  static String amort(double rate, double bal, int term, int numPayment) {
    rate /= 1200;
    double c = rate * bal / (1 - Math.pow(1 + rate, -term));
    double principal = (c - bal * rate) * Math.pow(1 + rate, numPayment - 1.);
    return String.format("num_payment %d c %.0f princ %.0f int %.0f balance %.0f",
        numPayment,
        c,
        principal,
        c - principal,
        bal * (1 - (Math.pow(1 + rate, numPayment) - 1) / (Math.pow(1 + rate, term) - 1)));
  }
}