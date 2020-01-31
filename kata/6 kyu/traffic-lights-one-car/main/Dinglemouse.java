import static java.util.stream.IntStream.range;

class Dinglemouse {
  static String[] trafficLights(String road, int n) {
    String[] moves = new String[n + 1];
    road = (moves[0] = road).replace("C", ".");

    int[] lights = range(0, road.length()).filter(i -> "RG".indexOf(moves[0].charAt(i)) > -1).toArray();
    for (int car = moves[0].indexOf('C'); n > 0; n--) {
      for (int l : lights) {
        int state = ((moves[0].charAt(l) == 'G' ? 0 : 6) + moves.length - n) % 11;
        road = road.substring(0, l) + (state < 5 ? 'G' : state > 5 ? 'R' : 'O') + road.substring(l + 1);
      }
      if (car > road.length() - 2 || ".G".indexOf(road.charAt(car + 1)) > -1) car++;
      moves[moves.length - n] = car < road.length() ? road.substring(0, car) + 'C' + road.substring(car + 1) : road;
    }
    return moves;
  }
}
