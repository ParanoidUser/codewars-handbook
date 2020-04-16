import static java.util.Collections.frequency;

import java.util.List;

class BallotsCounter {
  static String getWinner(List<String> listOfBallots) {
    return listOfBallots.stream().distinct().filter(c -> frequency(listOfBallots, c) > listOfBallots.size() / 2).findFirst().orElse(null);
  }
}
