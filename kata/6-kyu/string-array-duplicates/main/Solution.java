import static java.util.stream.Stream.of;

interface Solution {
  static String[] dup(String[] arr) {
    return of(arr).map(s -> s.replaceAll("(\\w)\\1+", "$1")).toArray(String[]::new);
  }
}