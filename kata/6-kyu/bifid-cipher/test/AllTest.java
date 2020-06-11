import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AllTest {
  @Test
  void encode() {
    assertEquals("CWUAS", BifidCipher.encodeBifid("", "ELVIS"));
    assertEquals("", BifidCipher.encodeBifid("KEY", ""));
    assertEquals("ORGFOSR", BifidCipher.encodeBifid("CODEWARS", "WARRIOR"));
    assertEquals("EKUCERRRIS", BifidCipher.encodeBifid("ELVIS", "JIMMY JAMES"));
    assertEquals("RCPGSSBBBDTELGTHLGHG", BifidCipher.encodeBifid("BIFID", "THE INVENTOR OF BIFID IS"));
  }

  @Test
  void decode() {
    assertEquals("ELVIS", BifidCipher.decodeBifid("", "CWUAS"));
    assertEquals("", BifidCipher.decodeBifid("", ""));
    assertEquals("MEMPHIS", BifidCipher.decodeBifid("ELVIS", "GMGIIBT"));
    assertEquals("FELIXDELASTELLE", BifidCipher.decodeBifid("INVENTOR", "DLXEBIQNLVEVZLE"));
  }
}
