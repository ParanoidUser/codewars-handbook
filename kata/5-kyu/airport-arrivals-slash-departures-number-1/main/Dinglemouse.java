interface Dinglemouse {
  static String[] flapDisplay(String[] lines, int[][] rotors) {
    var abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ?!@#&()|<>.:=-+*/0123456789";
    for (var i = 0; i < lines.length; i++) {
      var line = new StringBuilder();
      int f = 0;
      for (int j = 0; j < lines[i].length(); j++) {
        f += rotors[i][j];
        line.append(abc.charAt((abc.indexOf(lines[i].charAt(j)) + f) % abc.length()));
      }
      lines[i] = line.toString();
    }
    return lines;
  }
}
