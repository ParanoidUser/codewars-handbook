import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NotePassingTest {
  @Test
  void sample() {
    assertEquals("", NotePassing.decipher(""));
    assertEquals("OMG MAY YOUR DRESS IS SO CUTE", NotePassing.decipher("HFZ FTR RHNK WKXLL BL LH VNMX"));
    assertEquals("school is so boring i can't believe there are so many hours left", NotePassing.decipher("lvahhe bl lh uhkbgz b vtg'm uxebxox maxkx tkx lh ftgr ahnkl exym"));
    assertEquals("Hey May! Which teacher do you think is nicer, Mr. Jones or Mrs. Patel?", NotePassing.decipher("Axr Ftr! Pabva mxtvaxk wh rhn mabgd bl gbvxk, Fk. Chgxl hk Fkl. Itmxe?"));
  }
}
