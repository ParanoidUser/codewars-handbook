import static java.util.List.of;

interface WhichNote {
  static String whichNote(int keyPressCount) {
    return of("A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#").get(--keyPressCount % 88 % 12);
  }
}
