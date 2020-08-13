import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AllTest {
  @Test
  void encode() {
    assertEquals("CWUAS", new BifidCipher().encodeBifid("", "ELVIS"));
    assertEquals("", new BifidCipher().encodeBifid("KEY", ""));
    assertEquals("ORGFOSR", new BifidCipher().encodeBifid("CODEWARS", "WARRIOR"));
    assertEquals("EKUCERRRIS", new BifidCipher().encodeBifid("ELVIS", "JIMMY JAMES"));
    assertEquals("RCPGSSBBBDTELGTHLGHG", new BifidCipher().encodeBifid("BIFID", "THE INVENTOR OF BIFID IS"));
  }

  @Test
  void decode() {
    assertEquals("ELVIS", new BifidCipher().decodeBifid("", "CWUAS"));
    assertEquals("", new BifidCipher().decodeBifid("", ""));
    assertEquals("MEMPHIS", new BifidCipher().decodeBifid("ELVIS", "GMGIIBT"));
    assertEquals("FELIXDELASTELLE", new BifidCipher().decodeBifid("INVENTOR", "DLXEBIQNLVEVZLE"));
  }
}
