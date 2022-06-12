import static java.util.stream.IntStream.range;

interface Dinglemouse {
  static String[] trafficLights(String road, int n) {
    var moves = new String[n + 1];
    moves[0] = road;
    road = road.replace("C", ".");

    int car = moves[0].indexOf('C');
    for (; n > 0; n--) {
      road = switchLights(road, moves.length - n, moves[0]);
      if (car > road.length() - 2 || ".G".indexOf(road.charAt(car + 1)) > -1) {
        car++;
      }
      moves[moves.length - n] = car < road.length() ? road.substring(0, car) + 'C' + road.substring(car + 1) : road;
    }
    return moves;
  }

  private static String switchLights(String road, int n, String move) {
    for (int l : range(0, road.length()).filter(i -> "RG".indexOf(move.charAt(i)) > -1).toArray()) {
      int state = ((move.charAt(l) == 'G' ? 0 : 6) + n) % 11;
      road = road.substring(0, l) + (state < 5 ? 'G' : state > 5 ? 'R' : 'O') + road.substring(l + 1);
    }
    return road;
  }
}
