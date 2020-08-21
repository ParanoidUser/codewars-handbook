  import static java.lang.Character.toChars;
  import static java.util.stream.Collectors.joining;
  import static java.util.stream.IntStream.range;

  interface Kata {
    static char triangle(String r) {
      return r.length() == 1 ? r.charAt(0) : triangle(range(0, r.length() - 1).mapToObj(
             i -> "" + (r.charAt(i) == r.charAt(i + 1) ? r.charAt(i) : toChars('Û' - r.charAt(i) - r.charAt(i + 1))[0]))
             .collect(joining()));
    }
  }
