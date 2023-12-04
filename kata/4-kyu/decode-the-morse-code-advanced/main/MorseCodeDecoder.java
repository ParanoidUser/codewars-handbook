import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

interface MorseCodeDecoder {
  static String decodeMorse(String morseCode) {
    return stream(morseCode.trim().split(" {3}"))
        .map(w -> stream(w.split(" ")).map(MorseCode::get).collect(joining()))
        .collect(joining(" "));
  }

  static String decodeBits(String bits) {
    bits = bits.replaceAll("(^0+)|(0+$)", "");
    int min = stream(bits.split("(?<=0)(?=1)|(?<=1)(?=0)")).mapToInt(String::length).min().orElseThrow();
    return bits.replace("00000".repeat(min), "   ")
        .replace("000".repeat(min), " ")
        .replace("111".repeat(min), "-")
        .replace("1".repeat(min), ".")
        .replace("0".repeat(min), "");
  }
}