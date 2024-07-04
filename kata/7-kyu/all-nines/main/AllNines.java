import static java.math.BigInteger.*;

import java.math.BigInteger;

interface AllNines {
  static BigInteger allNines(BigInteger x) {
    if (x.mod(TWO).equals(ZERO) || x.mod(valueOf(5)).equals(ZERO)) {
      return valueOf(-1);
    }

    var m = valueOf(9);
    while (!m.mod(x).equals(ZERO)) {
      m = m.multiply(TEN).add(valueOf(9));
    }
    return m.divide(x);
  }
}