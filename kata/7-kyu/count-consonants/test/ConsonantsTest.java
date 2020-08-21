import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ConsonantsTest {
  @Test
  void sample() {
    assertEquals(0, Consonants.getCount(""));
    assertEquals(0, Consonants.getCount("aaaaa"));
    assertEquals(2, Consonants.getCount("XaeiouX"));
    assertEquals(5, Consonants.getCount("Bbbbb"));
    assertEquals(7, Consonants.getCount("helLo world"));
    assertEquals(7, Consonants.getCount("h^$&^#$&^elLo world"));
    assertEquals(2, Consonants.getCount("012345_Cb"));
    assertEquals(0, Consonants.getCount("0123456789"));
  }
}
