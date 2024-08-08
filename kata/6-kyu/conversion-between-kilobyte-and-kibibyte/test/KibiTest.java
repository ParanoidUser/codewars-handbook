import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class KibiTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      1 KiB, 1.024 kB
      1 MiB, 1.049 MB
      1 GB, 0.931 GiB
      160 KiB, 163.84 kB
      43.21 MB, 41.208 MiB
      3.1415 TB, 2.857 TiB
      """)
  void sample(String memorysize, String expected) {
    assertEquals(expected, Kibi.memorysizeConversion(memorysize));
  }
}