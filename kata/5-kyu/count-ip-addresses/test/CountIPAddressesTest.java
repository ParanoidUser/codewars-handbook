import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CountIPAddressesTest {
  @Test
  void sample() {
    assertEquals(50, CountIPAddresses.ipsBetween("10.0.0.0", "10.0.0.50"));
    assertEquals(246, CountIPAddresses.ipsBetween("20.0.0.10", "20.0.1.0"));
    assertEquals(4294967295L, CountIPAddresses.ipsBetween("0.0.0.0", "255.255.255.255"));
  }
}