class Dinglemouse {
  static String horseRacing(double[][] horses) {
    String[] top = raceTop(horses);
    if (top[0].isEmpty()) {
      top[0] = top[1] = top[2] = "X";
    } else if (top[1].isEmpty()) {
      if (top[0].length() == 4) {
        top[1] = "X";
        top[2] = "-";
      } else {
        top[1] = top[2] = (top[0].length() == 6) ? "-" : "X";
      }
    } else if (top[2].isEmpty()) {
      top[2] = top[0].length() + top[1].length() == 6 ? "-" : "X";
    }
    return "1st: " + top[0].trim() + " 2nd: " + top[1].trim() + " 3rd: " + top[2].trim();
  }

  private static String[] raceTop(double[][] horses) {
    String[] top = {"", "", ""};
    double[] dist = new double[3];
    for (int i = 0; i < horses[0].length && top[0].length() + top[1].length() + top[2].length() < 6; i++) {
      int place = top[0].isEmpty() ? 0 : top[1].isEmpty() ? 1 : 2;
      for (int h = 0; h < 3; h++) {
        if (dist[h] < 10 && (dist[h] += horses[h][i]) >= 10) {
          top[place] += (h > 1 ? "C " : h > 0 ? "B " : "A ");
        }
      }
    }
    return top;
  }
}