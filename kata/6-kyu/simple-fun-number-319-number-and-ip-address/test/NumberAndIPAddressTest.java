import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NumberAndIPAddressTest {
  @Test
  void sample() {
    assertEquals("167773121", NumberAndIPAddress.numberAndIPaddress("10.0.3.193"));
    assertEquals("10.3.3.193", NumberAndIPAddress.numberAndIPaddress("167969729"));
    assertEquals("177.188.200.91", NumberAndIPAddress.numberAndIPaddress("2981939291"));
  }
}