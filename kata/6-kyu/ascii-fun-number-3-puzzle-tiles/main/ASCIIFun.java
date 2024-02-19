import java.util.LinkedList;

interface ASCIIFun {
  static String puzzleTiles(int width, int height) {
    var tiles = new LinkedList<String>();
    tiles.add("  " + " _( )__".repeat(width));
    for (int i = 0; i < height; i++) {
      if (i % 2 == 0) {
        tiles.add(" _|" + "     _|".repeat(width));
        tiles.add("(_" + "   _ (_".repeat(width));
      } else {
        tiles.add(" |_" + "     |_".repeat(width));
        tiles.add("  _)" + " _   _)".repeat(width));
      }
      tiles.add(" |" + "__( )_|".repeat(width));
    }
    return String.join("\n", tiles);
  }
}