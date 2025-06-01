import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      '','',''
      +,+,+
      -,-,-
      +,-,0
      -,+,0
      -+,++,0+
      --,-+,-0
      +--,+--,+--
      -++,-+-,-+0
      +-+,-++,00+
      -++,+--,000
      -++-,-+-+,-+00
      --++,++++,00++
      ---+,-+++,-00+
      -----,-----,-----
      --++--,++--++,000000
      -+-+-+,-+-+-+,-+-+-+
      +-----+-,---++-++,0--00-+0
      --+++-+-,+++++---,00+++-0-
      +++--+---,++----++-,++0--000-
      -++-+-++-,+-++++---,00+0+000-
      ---++-+--,-+++--++-,-00+0-+0-
      ++-++--++-,-+++-++-++,0+0+0000+0
      +-----+++-,--+-+-++--,0-0-0-++0-
      -+--+-+---,-+--+-+-+-,-+--+-+-0-
      """)
  void sample(String s1, String s2, String expected) {
    assertEquals(expected, Solution.neutralise(s1, s2));
  }
}