import static java.util.stream.IntStream.of;

class Divisible {
  static boolean isDivisible(int... args) {
    return args.length == 0 || of(args).allMatch(i -> i != 0 && args[0] % i == 0);
  }
}
