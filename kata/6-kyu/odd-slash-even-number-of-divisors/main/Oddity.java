import java.math.BigInteger;

class Oddity {
  static String oddity(BigInteger n) {
    return n.abs().sqrt().pow(2).compareTo(n) == 0 ? "odd" : "even";
  }
}
