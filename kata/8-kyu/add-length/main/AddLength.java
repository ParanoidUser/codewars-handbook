import static java.util.stream.Stream.of;

interface AddLength {
  static String[] addLength(String str) {
    return of(str.split(" ")).map(s -> s + " " + s.length()).toArray(String[]::new);
  }
}