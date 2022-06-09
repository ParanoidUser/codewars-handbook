interface EightiesKids2 {
  static String findSpaceship(String map) {
    var lines = map.split("\n");
    for (var i = 0; i < lines.length; i++) {
      if (lines[i].indexOf('X') >= 0) {
        return "[" + lines[i].indexOf('X') + ", " + (lines.length - i - 1) + "]";
      }
    }
    return "Spaceship lost forever.";
  }
}
