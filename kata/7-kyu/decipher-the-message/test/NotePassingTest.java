import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NotePassingTest {
  @Test
  public void testEmptyNote() {
    assertEquals("Empty notes should still be empty after decoding", "", NotePassing.decipher(""));
  }

  @Test
  public void testLowerCaseNote() {
    assertEquals("Error in deciphering lowercase letters", "school is so boring i can't believe there are so many hours left", NotePassing.decipher("lvahhe bl lh uhkbgz b vtg'm uxebxox maxkx tkx lh ftgr ahnkl exym"));
  }

  @Test
  public void testUpperCaseNote() {
    assertEquals("Error in deciphering uppercase letters", "OMG MAY YOUR DRESS IS SO CUTE", NotePassing.decipher("HFZ FTR RHNK WKXLL BL LH VNMX"));
  }

  @Test
  public void testPunctionationNote() {
    assertEquals("Error in deciphering uppercase letters", "Hey May! Which teacher do you think is nicer, Mr. Jones or Mrs. Patel?", NotePassing.decipher("Axr Ftr! Pabva mxtvaxk wh rhn mabgd bl gbvxk, Fk. Chgxl hk Fkl. Itmxe?"));
  }
}
