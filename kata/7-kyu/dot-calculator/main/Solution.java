interface Solution {
  static String calc(String txt) {
    var chunks = txt.split(" ");
    return ".".repeat(switch (chunks[1]) {
      case "+" -> chunks[0].length() + chunks[2].length();
      case "-" -> chunks[0].length() - chunks[2].length();
      case "*" -> chunks[0].length() * chunks[2].length();
      case "//" -> chunks[0].length() / chunks[2].length();
      default -> 0;
    });
  }
}