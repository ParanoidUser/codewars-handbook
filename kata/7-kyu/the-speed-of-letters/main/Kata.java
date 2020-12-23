interface Kata {
  static String speedify(String input) {
    var push = " ".repeat(input.length() + 25);
    for (int i = 0, j; i < input.length(); i++) {
      push = push.substring(0, j = i + input.charAt(i) - 65) + input.charAt(i) + push.substring(j + 1);
    }
    return push.replaceAll("\\s*$", "");
  }
}