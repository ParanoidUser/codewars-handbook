import static java.util.stream.Collectors.joining;

import java.util.List;

final class CodeDecode {
  static final List<String> CODES = List.of("10", "11", "0110", "0111", "001100", "001101", "001110", "001111", "00011000", "00011001");

  static String code(String strng) {
    return strng.chars().map(c -> c - 48).mapToObj(CODES::get).collect(joining());
  }

  static String decode(String str) {
    var decoded = new StringBuilder();
    int l = 1;
    int i;
    for (i = 0; i < str.length(); i++, l++)
      if (str.charAt(i) == '1') {
        decoded.append(Integer.parseInt(str.substring(i + 1, l + i + 1), 2));
        i += l;
        l = 0;
      }
    return decoded.toString();
  }

  private CodeDecode() {}
}
