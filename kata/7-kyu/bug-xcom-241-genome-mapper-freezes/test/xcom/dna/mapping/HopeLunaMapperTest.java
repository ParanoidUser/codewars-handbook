package xcom.dna.mapping;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class HopeLunaMapperTest {

  private final HopeLunaMapper mapper = new HopeLunaMapper();

  @Test
  void nothing() {
    assertEquals("", mapper.mapStrand(null));
  }

  @ParameterizedTest
  @ValueSource(ints = {1, 100, 20000})
  void sample(int repeat) {
    SlcBase source = toStrand("LUNAHOPE".repeat(repeat));
    assertEquals("HOPELUNA".repeat(repeat), mapper.mapStrand(source));
  }

  private SlcBase toStrand(String str) {
    SlcBase current = null;
    int len = str.length();
    for (int i = 0; i < len; ++i) {
      current = new SlcBase(current, str.charAt(len - i - 1));
    }
    return current;
  }
}