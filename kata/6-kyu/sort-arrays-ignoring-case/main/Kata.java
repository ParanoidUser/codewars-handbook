import static java.util.stream.Stream.of;

interface Kata {
  static String[] sort(String[] names) {
    return of(names).sorted(String.CASE_INSENSITIVE_ORDER).toArray(String[]::new);
  }
}