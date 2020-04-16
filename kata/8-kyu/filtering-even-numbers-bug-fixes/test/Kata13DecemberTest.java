import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class Kata13DecemberTest {
  @Test
  public void firstTest()  {
    assertEquals(List.of(1, 3, 5, 7), Kata13December.filterOddNumber(List.of(1, 2, 2, 2, 4, 3, 4, 5, 6, 7)));
  }

  @Test
  public void secondTest() {
    assertEquals(List.of(1, 3),  Kata13December.filterOddNumber(List.of(1, 2, 2, 2, 4, 3, 4)));
  }
}
