import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FindTheDateTest {
  @Test
   void sample() {
    assertEquals("2017.12.31", FindTheDate.getDate("2017.12.30 22:15", 10));
    assertEquals("2018.01.12", FindTheDate.getDate("2017.12.30 22:15", 300));
    assertEquals("2017.12.25", FindTheDate.getDate("2017.12.30 22:15", -125));
  }
}