import static java.util.stream.IntStream.range;

interface Kata {
  static Boolean isSatorSquare(char[][] t) {
    return range(0, t.length).boxed().flatMap(i -> range(0, t.length).mapToObj(j -> new int[]{i, j}))
        .allMatch(x -> t[x[0]][x[1]] == t[x[1]][x[0]] && t[x[0]][x[1]] == t[t.length - x[0] - 1][t.length - x[1] - 1]);
  }
}