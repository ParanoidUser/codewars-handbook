import static java.util.List.of;

interface Keypad {
  static int presses(String phrase) {
    var taps = 0;
    for (char c : phrase.toUpperCase().toCharArray()) {
      for (var s : of("1", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9", "*", " 0", "#")) {
        taps += s.indexOf(c) + 1;
      }
    }
    return taps;
  }
}
