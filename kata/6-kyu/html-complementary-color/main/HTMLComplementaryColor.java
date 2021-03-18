interface HTMLComplementaryColor {
  static String getReversedColor(String hexColor) {
    if (hexColor == null || !hexColor.matches("(?i)[0-9a-f]{0,6}")) {
      throw new IllegalArgumentException();
    }
    int complement = 0xFFFFFF - Integer.parseInt(hexColor.isEmpty() ? "0" : hexColor, 16);
    return "#" + Integer.toString(complement, 16).toUpperCase();
  }
}