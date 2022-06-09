interface Kata {
  static String speedify(String input) {
    var push = " ".repeat(input.length() + 25);
    for (int i = 0; i < input.length(); i++) {
      int j = i + input.charAt(i) - 65;
      push = push.substring(0, j) + input.charAt(i) + push.substring(j + 1);
    }
    return push.replaceAll("\\s*$", "");
  }
}