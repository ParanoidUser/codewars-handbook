interface EightiesKids2 {
  static String findSpaceship(String map) {
    var lines = map.split("\n");
    for (int i = 0; i < lines.length; i++) {
      if (lines[i].indexOf('X') >= 0) {
        return "[" + lines[i].indexOf('X') + ", " + (lines.length - ++i) + "]";
      }
    }
    return "Spaceship lost forever.";
  }
}
