import static java.math.BigInteger.valueOf;

interface Reduce {
  static int[] myFraction(int[] fractions) {
    int gcd = valueOf(fractions[0]).gcd(valueOf(fractions[1])).intValue();
    fractions[0] /= gcd;
    fractions[1] /= gcd;
    return fractions;
  }
}