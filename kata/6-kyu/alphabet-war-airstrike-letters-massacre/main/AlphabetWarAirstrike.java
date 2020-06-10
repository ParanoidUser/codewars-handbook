  interface AlphabetWarAirstrike {
    static String alphabetWar(String fight) {
      int score = fight.replaceAll("\\w?\\*\\w?", "_").chars().reduce(0, (a, b) -> (b = "wpbs0zdqm".indexOf(b)) < 0 ? a : a + b - 4);
      return score == 0 ? "Let's fight again!" : (score < 0 ? "Left" : "Right") + " side wins!";
    }
  }
