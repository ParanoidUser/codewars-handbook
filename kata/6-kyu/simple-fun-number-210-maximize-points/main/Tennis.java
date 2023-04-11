import java.util.Arrays;

interface Tennis {
  static int maximizePoints(int[] team1, int[] team2) {
    Arrays.sort(team1);
    Arrays.sort(team2);
    int wins = 0;
    for (int p : team1) {
      wins += p > team2[wins] ? 1 : 0;
    }
    return wins;
  }
}