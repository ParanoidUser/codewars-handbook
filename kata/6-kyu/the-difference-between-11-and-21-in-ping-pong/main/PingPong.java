import java.util.ArrayList;
import java.util.List;

interface PingPong {
  static List<Score> result(String s) {
    var total = getScores(s, 10);
    total.addAll(getScores(s, 20));
    return total;
  }

  static List<Score> getScores(String game, int n) {
    var scores = new ArrayList<Score>();
    int me = 0;
    int opp = 0;
    for (char match : game.toCharArray()) {
      if (match == 'W') me++; else opp++;
      if ((me > n || opp > n) && Math.abs(me - opp) > 1) {
        scores.add(new Score(me, opp));
        me = 0;
        opp = 0;
      }
    }
    if (me > 0 || opp > 0) {
      scores.add(new Score(me, opp));
    }
    return scores;
  }
}
