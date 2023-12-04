import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MorseCodeDecoderTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      .... . -.--   .--- ..- -.. ., 1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011
      ., 01110
      """)
  void sampleSignal(String code, String signal) {
    assertEquals(code, MorseCodeDecoder.decodeBits(signal));
  }

  @ParameterizedTest
  @CsvSource(textBlock = """
      HEY JUDE, .... . -.--   .--- ..- -.. .
      E, .
      """)
  void sampleCode(String text, String code) {
    assertEquals(text, MorseCodeDecoder.decodeMorse(code));
  }
}