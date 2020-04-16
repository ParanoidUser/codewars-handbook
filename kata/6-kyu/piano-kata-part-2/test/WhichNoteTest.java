import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WhichNoteTest {
  @Test
  public void exampleTests() {
    assertEquals("A", WhichNote.whichNote(1));
    assertEquals("C#", WhichNote.whichNote(5));
    assertEquals("G#", WhichNote.whichNote(12));
    assertEquals("D", WhichNote.whichNote(42));
    assertEquals("C", WhichNote.whichNote(88));
    assertEquals("A", WhichNote.whichNote(89));
    assertEquals("C", WhichNote.whichNote(92));
    assertEquals("G#", WhichNote.whichNote(100));
    assertEquals("G", WhichNote.whichNote(111));
    assertEquals("G#", WhichNote.whichNote(200));
    assertEquals("F", WhichNote.whichNote(2017));
  }
}
