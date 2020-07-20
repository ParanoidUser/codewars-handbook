import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals("Fake tweet.", Dinglemouse.fireAndFury("K"));
    assertEquals("Fake tweet.", Dinglemouse.fireAndFury("FYRYFIRUFIRUFURE"));
    assertEquals("Fake tweet.", Dinglemouse.fireAndFury("AAFIREBBFURYCC"));
    assertEquals("I am furious. You and you are fired!", Dinglemouse.fireAndFury("FURYYYFIREYYFIRE"));
    assertEquals("You are fired! I am really furious. You are fired!", Dinglemouse.fireAndFury("FIREYYFURYYFURYYFURRYFIRE"));
  }
}