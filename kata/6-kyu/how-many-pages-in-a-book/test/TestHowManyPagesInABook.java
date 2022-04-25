import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestHowManyPagesInABook {
  @Test
  void sample() {
    assertEquals(5, HowManyPagesInABook.amountOfPages(5));
    assertEquals(17, HowManyPagesInABook.amountOfPages(25));
    assertEquals(97, HowManyPagesInABook.amountOfPages(185));
    assertEquals(256, HowManyPagesInABook.amountOfPages(660));
    assertEquals(401, HowManyPagesInABook.amountOfPages(1095));
    assertEquals(8365, HowManyPagesInABook.amountOfPages(32353));
    assertEquals(34902, HowManyPagesInABook.amountOfPages(163404));
  }
}
