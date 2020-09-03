import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class TestFixure {
  @Test
  void sample() {
    assertEquals(List.of("Jason", "Jordan"), findList.findChildren(List.of("Jason", "Jackson", "Jordan", "Johnny"), List.of("Jason", "Jordan", "Jennifer")));
    assertEquals(List.of("JJ", "Jason"), findList.findChildren(List.of("Jason", "Jackson", "Johnson", "JJ"), List.of("Jason", "James", "JJ")));
    assertEquals(List.of("JAsoN", "jASon"), findList.findChildren(List.of("jASon", "JAsoN", "JaSON", "jasON"), List.of("JasoN", "jASOn", "JAsoN", "jASon", "JASON")));
  }
}
