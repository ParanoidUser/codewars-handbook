import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LuckyTicketTest {
  @Test
  void sample() {
    assertEquals(50412, new LuckyTicket().numberOfTickets(100000, 999999));
  }
}