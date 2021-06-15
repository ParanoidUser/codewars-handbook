import static java.util.stream.IntStream.of;

interface Kata {
  static String printNumber(int num, char ch) {
    var n = new String[]{
        " @@@@   @@   @@@@  @@@@ @@  @@@@@@@@   @@ @@@@@@ @@@@  @@@@ ",
        "@@  @@ @@@  @@  @@@@  @@@@  @@@@      @@  @@  @@@@  @@@@  @@",
        "@@  @@@ @@     @@    @@ @@  @@@@@@@  @@@@    @@  @@@@ @@  @@",
        "@@  @@  @@    @@     @@  @@@@@    @@@@  @@  @@   @@@@  @@@@ ",
        "@@  @@  @@   @@   @@  @@    @@    @@@@  @@ @@   @@  @@  @@  ",
        " @@@@ @@@@@@@@@@@@ @@@@     @@@@@@@  @@@@  @@    @@@@  @@   "};

    var s = new StringBuilder((ch + "").repeat(40)).append("\n").append(ch).append(" ".repeat(38)).append(ch).append("\n");
    of(0, 1, 2, 3, 4, 5).forEach(i -> {
          s.append(ch).append("  ");
          of(10000, 1000, 100, 10, 1).forEach(j -> s.append(n[i].substring(num / j % 10 * 6, num / j % 10 * 6 + 6).replace('@', ch)).append(" "));
          s.append(" ").append(ch).append("\n");
        }
    );
    return s.append(ch).append(" ".repeat(38)).append(ch).append("\n").append((ch + "").repeat(40)).toString();
  }
}