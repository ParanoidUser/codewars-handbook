import static java.util.stream.Stream.of;

interface Kata {
  static String calculate(String str) {
    return of(str.replace("minus", "plus-").split("plus")).mapToInt(Integer::parseInt).sum() + "";
  }
}