import static java.util.regex.Pattern.compile;

interface Solution {
  static int waterbombs(String fire, int w) {
    return (int) compile("x{1," + w + "}Y*").matcher(fire).results().count();
  }
}
