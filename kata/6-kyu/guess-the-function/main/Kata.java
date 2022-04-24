import static java.security.MessageDigest.getInstance;
import static org.apache.commons.lang3.StringUtils.isAsciiPrintable;

interface Kata {
  static String f(String s) {
    try {
      if (isAsciiPrintable(s)) {
        var md5 = new StringBuilder(32);
        for (byte b : getInstance("MD5").digest(s.getBytes())) {
          md5.append(String.format("%02x", b & 0xff));
        }
        return md5.reverse().toString();
      }
    } catch (Exception ignore) { /* Ignore */ }
    return "";
  }
}