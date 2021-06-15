import static java.util.stream.Stream.of;

interface Nba {
  static String nbaCup(String resultSheet, String toFind) {
    if (toFind.isEmpty()) {
      return "";
    }

    var stats = new int[5];
    for (var match : of(resultSheet.split(",")).filter(s -> s.contains(toFind)).toArray(String[]::new)) {
      if (match.contains(".")) {
        return "Error(float number):" + match;
      }
      var teams = match.substring(0, match.lastIndexOf(' ')).replaceAll(" \\d+ ", "@").split("@");
      if (teams[0].equals(toFind) || teams[1].equals(toFind)) {
        var pointsA = Integer.parseInt(match.substring(match.lastIndexOf(' ') + 1));
        var pointsB = Integer.parseInt(match.substring(teams[0].length() + 1, match.indexOf(teams[1]) - 1));
        updateMatchStatistics(pointsA, pointsB, match.startsWith(toFind), stats);
      }
    }
    return toFind + (stats[3] + stats[4] > 0 ? ":W=" + stats[0] + ";D=" + stats[2] + ";L=" + stats[1] + ";Scored=" + stats[3] + ";Conceded=" + stats[4] + ";Points=" + (3 * stats[0] + stats[2]) : ":This team didn't play!");
  }

  private static void updateMatchStatistics(int pointsA, int pointsB, boolean home, int[] stats) {
    if (home) {
      var temp = pointsA;
      pointsA = pointsB;
      pointsB = temp;
    }

    stats[3] += pointsA;
    stats[4] += pointsB;

    if (pointsA > pointsB) {
      stats[0]++;
    } else if (pointsA < pointsB) {
      stats[1]++;
    } else {
      stats[2]++;
    }
  }
}