import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
          1   , 1  ,    2
          123 , 456,    579
          888 , 222,    1110
          1372, 69 ,    1441
          12  , 456,    468
          100 , 101,    201
          04417465004110 , 5233514, 4417470237624
          63829983432984289347293874, 90938498237058927340892374089, 91002328220491911630239667963
      """)
  void sample(String a, String b, String expected) {
    assertEquals(expected, Kata.add(a, b));
  }
}