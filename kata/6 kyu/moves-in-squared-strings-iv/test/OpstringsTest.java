import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OpstringsTest {
  @Test
  public void test() {
    assertEquals("JANEmw\nXchZpg\ncgsCqC\nGyIrEx\ncagOBk\nEaNyeN", Opstrings.oper(Opstrings::rot90Counter, "EcGcXJ\naaygcA\nNgIshN\nyOrCZE\neBEqpm\nNkxCgw"));
    assertEquals("bTDimg\nYCHuBy\nxsqhLL\nqiXJEv\nPlRlKm\nhzXyDL", Opstrings.oper(Opstrings::diag2Sym, "LmvLyg\nDKELBm\nylJhui\nXRXqHD\nzlisCT\nhPqxYb"));
    assertEquals("NJVGhr|gKilwr|rwliKg\nMObsvw|WLhtvh|hvthLW\ntPhCtl|iRnCsG|GsCnRi\nsoEnhi|lQEhbV|VbhEQl\nrtQRLK|jtoPOJ|JOPotj\nzjliWg|zrstMN|NMtsrz", Opstrings.oper(Opstrings::selfieDiag2Counterclock, "NJVGhr\nMObsvw\ntPhCtl\nsoEnhi\nrtQRLK\nzjliWg"));
  }
}
