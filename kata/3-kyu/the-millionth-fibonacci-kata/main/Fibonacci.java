import static java.math.BigInteger.*;

import java.math.BigInteger;

interface Fibonacci {
  static BigInteger fib(BigInteger n) {
    BigInteger result = fib(ONE, ZERO, ZERO, ONE, n.abs());
    return n.signum() < 0 && !n.testBit(0) ? result.negate() : result;
  }

  private static BigInteger fib(BigInteger a, BigInteger b, BigInteger p, BigInteger q, BigInteger n) {
    return n.equals(ZERO) ? b :
           !n.testBit(0) ? fib(a, b, p.pow(2).add(q.pow(2)), p.multiply(q.multiply(TWO)).add(q.pow(2)), n.divide(TWO)) :
           fib(b.multiply(q).add(a.multiply(q)).add(a.multiply(p)), b.multiply(p).add(a.multiply(q)), p, q, n.subtract(ONE));
  }
}