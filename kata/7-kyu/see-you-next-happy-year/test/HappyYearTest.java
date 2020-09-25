import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HappyYearTest {
  @Test
  void sample() {
    assertEquals(1023, HappyYear.nextHappyYear(1001));
    assertEquals(1203, HappyYear.nextHappyYear(1123));
    assertEquals(2013, HappyYear.nextHappyYear(2001));
    assertEquals(2340, HappyYear.nextHappyYear(2334));
    assertEquals(3401, HappyYear.nextHappyYear(3331));
    assertEquals(2345, HappyYear.nextHappyYear(2342));
    assertEquals(2013, HappyYear.nextHappyYear(1987));
    assertEquals(2014, HappyYear.nextHappyYear(2013));
    assertEquals(3012, HappyYear.nextHappyYear(3000));
    assertEquals(5601, HappyYear.nextHappyYear(5555));
    assertEquals(7801, HappyYear.nextHappyYear(7712));
    assertEquals(8091, HappyYear.nextHappyYear(8088));
    assertEquals(8901, HappyYear.nextHappyYear(8800));
    assertEquals(9012, HappyYear.nextHappyYear(8989));
    assertEquals(9012, HappyYear.nextHappyYear(8977));
    assertEquals(6870, HappyYear.nextHappyYear(6869));
    assertEquals(9012, HappyYear.nextHappyYear(8999));
  }
}