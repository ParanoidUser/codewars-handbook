interface Dinglemouse {
  static String[] flapDisplay(String[] lines, int[][] rotors) {
    var abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ?!@#&()|<>.:=-+*/0123456789";
    for (var i = 0; i < lines.length; i++) {
      var line = new StringBuilder();
      for (int j = 0, f = 0; j < lines[i].length(); j++) {
        line.append(abc.charAt((abc.indexOf(lines[i].charAt(j)) + (f += rotors[i][j])) % abc.length()));
      }
      lines[i] = line.toString();
    }
    return lines;
  }
}
