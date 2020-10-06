import java.math.BigInteger;

class FindIt {
  int findIt(String s) {
    try {
      return new BigInteger(s.split("\\D+")[0]).modInverse(new BigInteger(s.split("\\D+")[2])).intValue();
    } catch (ArithmeticException e) {
      return -1;
    }
  }
}