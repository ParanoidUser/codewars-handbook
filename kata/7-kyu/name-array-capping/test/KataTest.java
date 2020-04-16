import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class KataTest {
  @Test
  public void downcase() {
    String[] strings = new String[] {"jo", "nelson", "jurie"};
    assertArrayEquals(new String[] {"Jo", "Nelson", "Jurie"}, Kata.capMe(strings));
  }
}
