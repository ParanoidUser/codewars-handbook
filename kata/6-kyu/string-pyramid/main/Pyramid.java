import static java.util.stream.IntStream.range;

interface Pyramid {
  static String watchPyramidFromTheSide(String characters) {
    if (characters == null) return null;
    var side = new StringBuilder();
    for (int i = characters.length() - 1; i >= 0; i--) {
      side.append(" ".repeat(i))
          .append((characters.charAt(i) + "").repeat(2 * (characters.length() - i) - 1))
          .append(" ".repeat(i))
          .append('\n');
    }
    return !side.isEmpty() ? side.deleteCharAt(side.length() - 1).toString() : characters;
  }

  static String watchPyramidFromAbove(String characters) {
    if (characters == null) return null;
    var above = new StringBuilder();
    for (var i = 0; i < characters.length(); i++) {
      for (var j = 0; j < i; j++) {
        above.append(characters.charAt(j));
      }
      above.append((characters.charAt(i) + "").repeat(2 * (characters.length() - i) - 1));
      for (int j = i; j > 0; j--) {
        above.append(characters.charAt(j - 1));
      }
      above.append("\n");
    }

    for (var i = 0; i < characters.length() - 1; i++) {
      for (var j = 0; j < characters.length() - i - 1; j++) {
        above.append(characters.charAt(j));
      }
      above.append((characters.charAt(characters.length() - i - 2) + "").repeat(2 * i + 1));
      for (int j = characters.length() - i - 1; j > 0; j--) {
        above.append(characters.charAt(j - 1));
      }
      above.append("\n");
    }
    return !above.isEmpty() ? above.deleteCharAt(above.length() - 1).toString() : characters;
  }

  static int countVisibleCharactersOfThePyramid(String characters) {
    return characters != null && !characters.isEmpty() ? (int) Math.pow(2 * characters.length() - 1., 2) : -1;
  }

  static int countAllCharactersOfThePyramid(String characters) {
    return characters != null && !characters.isEmpty() ? range(0, characters.length()).map(i -> (int) Math.pow(2 * (characters.length() - i) - 1., 2)).sum() : -1;
  }
}