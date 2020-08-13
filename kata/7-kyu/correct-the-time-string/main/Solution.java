import static java.util.Arrays.stream;

interface Solution {
  static String timeCorrect(String timestring) {
    if (timestring == null || !timestring.matches("\\d{2}:\\d{2}:\\d{2}")) return null;
    var units = stream(timestring.split(":")).mapToInt(Integer::parseInt).toArray();
    int sec = units[2] % 60;
    int min = (units[1] + units[2] / 60) % 60;
    int hours = (units[0] + (units[1] + units[2] / 60) / 60) % 24;
    return String.format("%02d:%02d:%02d", hours, min, sec);
  }
}
