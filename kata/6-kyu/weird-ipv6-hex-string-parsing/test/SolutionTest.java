import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      1234:5678:9ABC:D00F:1111:2222:3333:4445, 10264228481217
      5454:FBFD:9ABC:AAAA:FFFF:2222:FBDE:0101, 18544240608532
      0000:0000:0000:0000:0000:0000:0000:0000, 00000000
      FFFF:FFFF:BBBB:CCCC:1212:AABC:0000:1111, 6060444864304
      ACDD-0101-9ABC-AAAA-FFFF-2222-FBDE-ACCC, 48242406085346
      5454rFBFDr9ABCrAA0ArFAFFr2222rFBDEr0101, 18544230558532
      F234#5678#9ABC#D00F#1111#2222#3333#4485, 24264228481221
      """)
  void sample(String ip, String expected) {
    assertEquals(expected, Solution.parseIPv6(ip));
  }
}