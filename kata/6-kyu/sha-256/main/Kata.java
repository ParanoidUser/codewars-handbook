import static java.security.MessageDigest.getInstance;

import java.math.BigInteger;

interface Kata {
  static String sha256(String s) {
    try {
      return String.format("%064x", new BigInteger(1, getInstance("SHA-256").digest(s.getBytes())));
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }
}