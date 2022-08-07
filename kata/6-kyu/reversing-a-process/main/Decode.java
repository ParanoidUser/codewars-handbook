import static java.util.stream.IntStream.range;

interface Decode {
  static String decode(String r) {
    var plain = new StringBuilder();
    var code = r.toLowerCase().replaceAll("\\d", "");
    var key = Integer.parseInt(r.replaceAll("\\D", ""));
    for (char c : code.toCharArray()) {
      range(0, 26).filter(i -> i * key % 26 == c - 97).forEach(i -> plain.append((char) (i + 97)));
    }
    return code.length() == plain.length() ? plain.toString() : "Impossible to decode";
  }
}
