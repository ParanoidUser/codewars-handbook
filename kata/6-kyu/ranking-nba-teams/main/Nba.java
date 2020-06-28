import static java.util.stream.Stream.of;

interface Nba {
  static String nbaCup(String resultSheet, String toFind) {
    if (toFind.isEmpty()) {
      return "";
    }

    int wins = 0, losses = 0, draws = 0, scored = 0, conceded = 0;
    for (var match : of(resultSheet.split(",")).filter(s -> s.contains(toFind)).toArray(String[]::new)) {
      if (match.contains(".")) {
        return "Error(float number):" + match;
      }

      var teams = match.substring(0, match.lastIndexOf(' ')).replaceAll(" \\d+ ", "@").split("@");
      if (teams[0].equals(toFind) || teams[1].equals(toFind)) {

        int pointsA = Integer.parseInt(match.substring(match.lastIndexOf(' ') + 1));
        int pointsB = Integer.parseInt(match.substring(teams[0].length() + 1, match.indexOf(teams[1]) - 1));
        if (match.startsWith(toFind)) {
          int temp = pointsA;
          pointsA = pointsB;
          pointsB = temp;
        }

        scored += pointsA;
        conceded += pointsB;

        if (pointsA > pointsB) {
          wins++;
        } else if (pointsA < pointsB) {
          losses++;
        } else {
          draws++;
        }
      }
    }
    return toFind + (scored + conceded > 0 ? ":W=" + wins + ";D=" + draws + ";L=" + losses + ";Scored=" + scored + ";Conceded=" + conceded + ";Points=" + (3 * wins + draws) : ":This team didn't play!");
  }
}