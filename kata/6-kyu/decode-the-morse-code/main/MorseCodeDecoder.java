import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

interface MorseCodeDecoder {
  static String decode(String morseCode) {
    return stream(morseCode.trim().split("   "))
        .map(w -> stream(w.split(" ")).map(MorseCode::get).collect(joining()))
        .collect(joining(" "));
  }
}
