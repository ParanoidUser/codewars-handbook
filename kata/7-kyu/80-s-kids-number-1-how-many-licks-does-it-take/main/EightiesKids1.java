import java.util.Map;

interface EightiesKids1 {
  static String totalLicks(Map<String, Integer> env) {
    String challenge = "";
    int max = 0, licks = 252;
    for (var it : env.entrySet()) {
      if (it.getValue() > max) {
        max = it.getValue();
        challenge = " The toughest challenge was " + it.getKey() + ".";
      }
      licks += it.getValue();
    }
    return "It took " + licks + " licks to get to the tootsie roll center of a tootsie pop." + challenge;
  }
}
