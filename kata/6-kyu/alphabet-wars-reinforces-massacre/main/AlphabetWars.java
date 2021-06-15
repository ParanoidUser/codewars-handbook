import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

import java.util.Arrays;

interface AlphabetWars {
  static String reinforcesMassacre(String[] reinforces, String[] airstrikes) {
    var losses = new int[reinforces[0].length()];
    for (String strike : airstrikes) {
      var massacre = new int[losses.length];
      int bombAt;
      while ((bombAt = strike.indexOf('*')) != -1) {
        massacre[Math.max(bombAt - 1, 0)] = massacre[bombAt] = massacre[Math.min(bombAt + 1, massacre.length - 1)] = 1;
        strike = strike.substring(0, bombAt) + " " + strike.substring(bombAt + 1);
      }
      Arrays.setAll(losses, i -> losses[i] + massacre[i]);
    }
    return range(0, losses.length).mapToObj(l -> losses[l] < reinforces.length ? "" + reinforces[losses[l]].charAt(l) : "_").collect(joining());
  }
}
