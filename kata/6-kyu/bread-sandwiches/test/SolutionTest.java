import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      2, sandwich
      3, bread sandwich
      4, sandwich sandwich
      5, bread sandwich sandwich
      6, sandwich sandwich sandwich
      7, bread sandwich sandwich sandwich
      8, sandwich sandwich sandwich sandwich
      9, bread sandwich sandwich sandwich sandwich
      10, sandwich sandwich sandwich sandwich sandwich
      11, bread sandwich sandwich sandwich sandwich sandwich
      """)
  void sample(int slices, String name) {
    assertEquals(name, SandwichUtils.slicesToName(slices));
    assertEquals(slices, SandwichUtils.nameToSlices(name));
  }

  @ParameterizedTest
  @CsvSource(textBlock = """
      -100
      -2
      0
      1
      """)
  void invalidSlices(int slices) {
    assertNull(SandwichUtils.slicesToName(slices));
    assertNull(SandwichUtils.nameToSlices(slices));
  }

  @ParameterizedTest
  @CsvSource(textBlock = """
      ,
      ''
      bread
      sand wich
      sandwich bread sandwich
      bread sandwich invalid
      bread sandwich bread sandwich
      """)
  void invalidNames(Object name) {
    assertNull(SandwichUtils.slicesToName(name));
    assertNull(SandwichUtils.nameToSlices(name));
  }
}