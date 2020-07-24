import java.util.concurrent.atomic.AtomicInteger;

interface PlayPass {
  static String playPass(String s, int n) {
    var sid = new AtomicInteger();
    return s.toUpperCase().chars()
        .map(i -> i > 47 && i < 58 ? 105 - i : i > 64 && i < 91 && (i = (i + n % 26) % 91) < 65 ? i + 65 : i)
        .map(i -> sid.incrementAndGet() % 2 > 0 ? i : Character.toLowerCase(i))
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .reverse().toString();
  }
}
