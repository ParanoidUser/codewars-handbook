import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
                             a **&  bZ, 11000000000000000000000001
                          Abc e  $$  z, 11101000000000000000000001
                            !!a$%&RgTT, 10000010000000000101000000
            abcdefghijklmnopqrstuvwxyz, 11111111111111111111111111
                           aaaaaaaaaaa, 10000000000000000000000000
      &%&%/$%$%$%$%GYtf67fg34678hgfdyd, 00010111000000000001000010
      """)
  void sample(String line, String expected) {
    assertEquals(expected, Letters.search(line));
  }
}