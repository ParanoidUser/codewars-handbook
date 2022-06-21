import java.math.BigInteger;
import java.util.TreeSet;

interface GreenNumbers {
  static BigInteger get(int n) {
    var set = new TreeSet<BigInteger>();
    var num = BigInteger.valueOf(5);
    set.add(num);
    set.add(BigInteger.valueOf(6));

    int digitNo = 2;
    int counter = 2;
    while (counter < n + n / 5) {
      var powOfTen = BigInteger.TEN.pow(digitNo++);
      num = num.multiply(num).mod(powOfTen);
      set.add(num);
      set.add(powOfTen.add(BigInteger.ONE).subtract(num));
      counter += 2;
    }

    return n > 1 ? set.toArray(BigInteger[]::new)[n - 2] : BigInteger.ONE;
  }
}
