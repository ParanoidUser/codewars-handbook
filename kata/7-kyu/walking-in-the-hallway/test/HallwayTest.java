import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HallwayTest {
  @Test
  void sample() {
    assertEquals(3, Hallway.contact(">----<----<--------------->-->------<<------<---------->-------------"));
    assertEquals(-1, Hallway.contact("----<----->----"));
    assertEquals(1, Hallway.contact("---><----"));
    assertEquals(1, Hallway.contact("--->-<------->----<-"));
    assertEquals(2, Hallway.contact(">-----<-->--<-----"));
    assertEquals(3, Hallway.contact(">>-----<<"));
    assertEquals(5, Hallway.contact(">---------------<--------------------------<-------->---------<------->----------<----<---->>----------<------->>>---------------<<------>"));
  }
}