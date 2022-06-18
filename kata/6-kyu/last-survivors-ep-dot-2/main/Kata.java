import static java.util.stream.Collectors.joining;

interface Kata {
  static String lastSurvivors(String str) {
    String origin = str;
    str = str.chars().sorted().mapToObj(c -> (char) c + "").collect(joining());
    for (int i = 0; i < str.length() - 1; i++) {
      if (str.charAt(i) == str.charAt(i + 1)) {
        str = str.substring(0, i) + (str.charAt(i) > 'y' ? 'a' : (char) (str.charAt(i) + 1)) + str.substring(i + 2);
      }
    }
    return str.equals(origin) ? str : lastSurvivors(str);
  }
}