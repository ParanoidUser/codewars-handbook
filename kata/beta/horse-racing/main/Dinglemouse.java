import static java.util.stream.IntStream.range;
import static java.util.stream.Stream.of;

import java.util.function.IntSupplier;

interface Dinglemouse {
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
    var top = new String[]{"", "", ""};
    IntSupplier places = () -> range(0, 3).filter(i -> top[i].isEmpty()).findFirst().orElse(0);
    var dist = new double[3];
    for (var i = 0; i < horses[0].length && of(top).mapToInt(String::length).sum() < 6; i++) {
      var place = places.getAsInt();
      for (var h = 0; h < 3; h++) {
        moveHorse(horses[h][i], top, dist, place, h);
      }
    }
    return top;
  }

  private static void moveHorse(double horse, String[] top, double[] dist, int place, int h) {
    String name = "A ";
    if (h > 1) {
      name = "C ";
    } else if (h > 0) {
     name = "B ";
    }

    if (dist[h] < 10) {
      dist[h] += horse;
      if (dist[h] >= 10) {
        top[place] += name;
      }
    }
  }
}