import static java.util.stream.IntStream.of;

interface Divisible {
  static boolean isDivisible(int... args) {
    return of(args).allMatch(i -> i > 0 && args[0] % i < 1);
  }
}
