import java.math.BigInteger;

interface Powers {
  static BigInteger powers(int[] list) {
    return BigInteger.TWO.pow(list.length);
  }
}
