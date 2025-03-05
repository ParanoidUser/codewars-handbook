import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class PhoneNumberMergerExampleTest {
  @Test
  void testOverride() {
    var oldNum = new PhoneNumberMerger.PhoneNumber("mobile", "4567");
    var newNum = new PhoneNumberMerger.PhoneNumber("mobile", "9999");
    assertEquals(List.of(newNum), new PhoneNumberMerger().merge(List.of(oldNum), List.of(newNum)));
  }

  @Test
  void testMerge() {
    var landline = new PhoneNumberMerger.PhoneNumber("landline", "1234");
    var mobile = new PhoneNumberMerger.PhoneNumber("mobile", "9999");
    assertEquals(List.of(landline, mobile), new PhoneNumberMerger().merge(List.of(mobile), List.of(landline)));
  }
}