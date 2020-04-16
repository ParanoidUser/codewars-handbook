import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SongTests {
  @Test
  public void test1() {
    assertEquals("ABC", Dubstep.SongDecoder("WUBWUBABCWUB"));
  }

  @Test
  public void test2() {
    assertEquals("R L", Dubstep.SongDecoder("RWUBWUBWUBLWUB"));
  }
}
