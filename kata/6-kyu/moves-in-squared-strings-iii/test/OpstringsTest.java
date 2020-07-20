import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class OpstringsTest {
  @Test
  void sample() {
    assertEquals("weetvI\nuNhBWF\nUHiTNk\nyWflpG\nPxmFdj\nCwiIvZ", Opstrings.oper(Opstrings::diag1Sym, "wuUyPC\neNHWxw\nehifmi\ntBTlFI\nvWNpdv\nIFkGjZ"));
    assertEquals("Sixdvr\ndJNCGg\nmBWhca\nEYgZEv\nKDXVKc\nbORWle", Opstrings.oper(Opstrings::rot90Clock, "rgavce\nvGcEKl\ndChZVW\nxNWgXR\niJBYDO\nSdmEKb"));
    assertEquals("NJVGhr|NMtsrz\nMObsvw|JOPotj\ntPhCtl|VbhEQl\nsoEnhi|GsCnRi\nrtQRLK|hvthLW\nzjliWg|rwliKg", Opstrings.oper(Opstrings::selfieAndDiag1, "NJVGhr\nMObsvw\ntPhCtl\nsoEnhi\nrtQRLK\nzjliWg"));
  }
}
