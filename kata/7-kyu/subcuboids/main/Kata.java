import static java.math.BigInteger.valueOf;
import java.math.BigInteger;

interface Kata {
  static BigInteger subcuboids(int x, int y, int z) {
    return valueOf(x)
        .multiply(valueOf(y))
        .multiply(valueOf(z))
        .multiply(valueOf(++x))
        .multiply(valueOf(++y))
        .multiply(valueOf(++z))
        .divide(valueOf(8));
  }
}