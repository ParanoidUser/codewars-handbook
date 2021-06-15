import static java.util.stream.IntStream.range;

interface Decode {
  static String decode(String r) {
    var plain = new StringBuilder();
    var code = r.toLowerCase().replaceAll("\\d", "");
    var key = Integer.parseInt(r.replaceAll("[^\\d]", ""));
    for (char c : code.toCharArray()) {
      int temp = range(0, 26).filter(i -> i == c - 97).findFirst().orElse(0);
      range(0, 26).filter(i -> i * key % 26 == temp).forEach(i -> plain.append((char) (i + 97)));
    }
    return code.length() == plain.length() ? plain.toString() : "Impossible to decode";
  }
}
