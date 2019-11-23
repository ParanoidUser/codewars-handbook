import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void examples() {
    assertEquals("empty", Kata.describeList(List.of(0)));
    assertEquals("singleton", Kata.describeList(List.of(1)));
    assertEquals("longer", Kata.describeList(List.of(1, 2)));
    assertEquals("empty", Kata.describeList(List.of(0)));
    assertEquals("singleton", Kata.describeList(List.of(1.5)));
    assertEquals("longer", Kata.describeList(List.of(1.5, 2.5)));
  }
}
