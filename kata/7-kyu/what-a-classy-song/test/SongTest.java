import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SongTest {
  private final Song song = new Song("Mount Moose", "The Snazzy Moose");

  @Test
  void getTitleAndArtist() {
    assertEquals("Mount Moose", song.getTitle());
    assertEquals("The Snazzy Moose", song.getArtist());
  }

  @Test
  void noPublicFields() {
    assertEquals(0, song.getClass().getFields().length);
  }

  @Test
  void countListeners() {
    assertEquals(5, song.howMany(List.of("John", "Fred", "Bob", "Carl", "RyAn")));
    assertEquals(2, song.howMany(List.of("JoHn", "Luke", "AmAndA")));
    assertEquals(2, song.howMany(List.of("Amanda", "CalEb", "CarL", "Furgus")));
    assertEquals(1, song.howMany(List.of("JOHN", "FRED", "BOB", "CARL", "RYAN", "KATE")));
    assertEquals(1, song.howMany(List.of("Jack", "jacK")));
  }
}
