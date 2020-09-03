import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class OpstringsTest {
  @Test
   void sample() {
    assertEquals("QHdgSh\noaMDnH\nXxNNlC\nHxxvRi\nAvVTqb\nuRySvw", Opstrings.oper(Opstrings::vertMirror, "hSgdHQ\nHnDMao\nClNNxX\niRvxxH\nbqTVvA\nwvSyRu"));
    assertEquals("EWTOzI\nMCebkk\nMxZzuW\nwJddDv\nFHyJij\nxSfHVP", Opstrings.oper(Opstrings::vertMirror, "IzOTWE\nkkbeCM\nWuzZxM\nvDddJw\njiJyHF\nPVHfSx"));
    assertEquals("yeCt\nCSbg\nJVhv\nlVHt", Opstrings.oper(Opstrings::horMirror, "lVHt\nJVhv\nCSbg\nyeCt"));
    assertEquals("cEYz\nLPKo\ndbrZ\nnjMK", Opstrings.oper(Opstrings::horMirror, "njMK\ndbrZ\nLPKo\ncEYz"));
  }
}
