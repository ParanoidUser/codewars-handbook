package tridem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static tridem.TrilingualDemocracy.trilingualDemocracy;

import org.junit.jupiter.api.Test;

class TrilingualDemocracyTest {
  @Test
  void sample() {
    assertEquals('F', trilingualDemocracy("FFF".toCharArray()));
    assertEquals('K', trilingualDemocracy("IIK".toCharArray()));
    assertEquals('I', trilingualDemocracy("DFK".toCharArray()));
    assertEquals('D', trilingualDemocracy("IFK ".toCharArray()));
  }
}