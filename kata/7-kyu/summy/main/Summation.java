import static java.util.stream.Stream.of;

interface Summation {
  static long summy(String stringOfInts) {
    return of(stringOfInts.split(" ")).mapToLong(Long::parseLong).sum();
  }
}
