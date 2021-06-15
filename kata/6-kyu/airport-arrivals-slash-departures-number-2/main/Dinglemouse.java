final class Dinglemouse {
  static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ?!@#&()|<>.:=-+*/0123456789";

  static int[][] flapRotors(String[] linesBefore, String[] linesAfter) {
    var rotors = new int[linesBefore.length][];
    for (var i = 0; i < linesBefore.length; i++) {
      rotors[i] = new int[linesBefore[i].length()];
      for (int j = 0, f = ALPHABET.length(); j < linesBefore[i].length(); j++) {
        int afterPos = ALPHABET.indexOf(linesAfter[i].charAt(j));
        int beforePos = (ALPHABET.indexOf(linesBefore[i].charAt(j)) + f) % ALPHABET.length();
        f += rotors[i][j] = (afterPos - beforePos + ALPHABET.length()) % ALPHABET.length();
      }
    }
    return rotors;
  }

  private Dinglemouse() {}
}
