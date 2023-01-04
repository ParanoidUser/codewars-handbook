import static java.util.stream.Collectors.joining;

interface Kata {
  static char[] moreZeros(String s) {
    return s.chars().distinct().filter(i -> 1.44 * Math.log(i) > 2 * Integer.bitCount(i))
        .mapToObj(c -> "" + (char) c).collect(joining()).toCharArray();
  }
}