import java.util.Map;

class HtmlColorParser {
  private final Map<String, String> presetColors;

  HtmlColorParser(Map<String, String> presetColors) {
    this.presetColors = presetColors;
  }

  RGB parse(String color) {
    color = presetColors.getOrDefault(color.toLowerCase(), color);
    if (color.length() < 7) {
      color = color.replaceAll("((?i)[\\da-f])", "$1$1");
    }
    return new RGB(Integer.valueOf(color.substring(1, 3), 16), Integer.valueOf(color.substring(3, 5), 16), Integer.valueOf(color.substring(5), 16));
  }
}
