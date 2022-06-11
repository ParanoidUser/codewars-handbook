interface Dinglemouse {
  static int[][] flapRotors(String[] linesBefore, String[] linesAfter) {
    var alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ?!@#&()|<>.:=-+*/0123456789";
    var rotors = new int[linesBefore.length][];
    for (var i = 0; i < linesBefore.length; i++) {
      rotors[i] = new int[linesBefore[i].length()];
      int f = alphabet.length();
      for (int j = 0; j < linesBefore[i].length(); j++) {
        int afterPos = alphabet.indexOf(linesAfter[i].charAt(j));
        int beforePos = (alphabet.indexOf(linesBefore[i].charAt(j)) + f) % alphabet.length();
        f += rotors[i][j] = (afterPos - beforePos + alphabet.length()) % alphabet.length();
      }
    }
    return rotors;
  }
}
