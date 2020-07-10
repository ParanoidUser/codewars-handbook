import static java.util.stream.Stream.of;

interface Solution {
  static int solve(String s) {
    return of(s.split("[^aeiou]")).mapToInt(String::length).max().orElse(0);
  }
}