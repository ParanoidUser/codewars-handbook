import static java.util.stream.IntStream.of;

interface TugOWar {
  static String tugOWar(int[][] teams) {
    int t1 = of(teams[0]).sum();
    int t2 = of(teams[1]).sum();
    if (t1 == t2 && teams[0][0] == teams[1][teams[1].length - 1]) {
      return "It's a tie!";
    }
    return "Team " + (t1 > t2 || teams[0][0] > teams[1][teams[1].length - 1] ? 1 : 2) + " wins!";
  }
}