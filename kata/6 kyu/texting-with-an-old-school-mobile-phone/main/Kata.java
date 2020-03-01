class Kata {
  static String sendMessage(String message) {
    boolean low = true;
    char prev = 0;
    var keys = new StringBuilder();
    for (char c : message.toCharArray()) {
      if (Character.isLetter(c) && Character.isLowerCase(c) ^ low) {
        keys.append('#');
        low = !low;
        prev = 0;
      }
      int i = "1.,?!2abc_3def_4ghi_5jkl_6mno_7pqrs8tuv_9wxyz*'-+=0 ___#".indexOf(Character.toLowerCase(c));
      char key = i > 54 ? '#' : i > 49 ? '0' : i > 44 ? '*' : Character.forDigit(i / 5 + 1, 10);
      keys.append(key == prev ? " " : "").append(i % 5 > 0 ? (key + "").repeat(i % 5) : (key + "-"));
      prev = i % 5 > 0 ? key : 0;
    }
    return keys.toString();
  }
}
