import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SongTests {
  @Test
  void sample() {
    assertEquals("ABC", Dubstep.SongDecoder("WUBWUBABCWUB"));
    assertEquals("R L", Dubstep.SongDecoder("RWUBWUBWUBLWUB"));
  }
}
