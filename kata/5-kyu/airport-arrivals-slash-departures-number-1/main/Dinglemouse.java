class Dinglemouse extends Preloaded {
  static String[] flapDisplay(String[] lines, int[][] rotors) {
    for (int i = 0; i < lines.length; i++) {
      var line = new StringBuilder();
      for (int j = 0, f = 0; j < lines[i].length(); j++) {
        line.append(ALPHABET.charAt((ALPHABET.indexOf(lines[i].charAt(j)) + (f += rotors[i][j])) % ALPHABET.length()));
      }
      lines[i] = line.toString();
    }
    return lines;
  }
}
