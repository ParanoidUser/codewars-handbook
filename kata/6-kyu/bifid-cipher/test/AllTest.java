import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AllTest {
  @Test
  public void enCoding() {
    assertEquals("CWUAS", BifidCipher.encodeBifid("", "ELVIS"));
    assertEquals("", BifidCipher.encodeBifid("KEY", ""));
    assertEquals("ORGFOSR", BifidCipher.encodeBifid("CODEWARS", "WARRIOR"));
    assertEquals("EKUCERRRIS", BifidCipher.encodeBifid("ELVIS", "JIMMY JAMES"));
    assertEquals(
        "RCPGSSBBBDTELGTHLGHG", BifidCipher.encodeBifid("BIFID", "THE INVENTOR OF BIFID IS"));
  }

  @Test
  public void deCoding() {
    assertEquals("ELVIS", BifidCipher.decodeBifid("", "CWUAS"));
    assertEquals("", BifidCipher.decodeBifid("", ""));
    assertEquals("MEMPHIS", BifidCipher.decodeBifid("ELVIS", "GMGIIBT"));
    assertEquals("FELIXDELASTELLE", BifidCipher.decodeBifid("INVENTOR", "DLXEBIQNLVEVZLE"));
  }
}
