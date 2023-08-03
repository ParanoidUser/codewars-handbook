import java.util.List;

interface MysteryColorAnalyzer {
  /**
   * This method will determine how many distinct colors are in the given list
   *
   * <p>Colors are defined via the {@link Color} enum.
   *
   * @param mysteryColors list of colors from which to determine the number of distinct colors
   * @return number of distinct colors
   */
  int numberOfDistinctColors(List<Color> mysteryColors);

  /**
   * This method will count how often a specific color is in the given list
   *
   * <p>Colors are defined via the {@link Color} enum.
   *
   * @param mysteryColors list of colors from which to determine the count of a specific color
   * @param color color to count
   * @return number of occurrence of the color in the list
   */
  int colorOccurrence(List<Color> mysteryColors, Color color);
}