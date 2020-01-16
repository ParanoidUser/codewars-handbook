class Dinglemouse extends Preloaded {
  static int[][] flapRotors(String[] linesBefore, String[] linesAfter) {
    int[][] rotors = new int[linesBefore.length][];
    for (int i = 0; i < linesBefore.length; i++) {
      rotors[i] = new int[linesBefore[i].length()];
      for (int j = 0, f = ALPHABET.length(); j < linesBefore[i].length(); j++) {
        int afterPos = ALPHABET.indexOf(linesAfter[i].charAt(j));
        int beforePos = (ALPHABET.indexOf(linesBefore[i].charAt(j)) + f) % ALPHABET.length();
        f += rotors[i][j] = (afterPos - beforePos + ALPHABET.length()) % ALPHABET.length();
      }
    }
    return rotors;
  }
}
