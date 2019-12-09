import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleTests {
  @Test
  public void ex() {
    String expected =
        "Two green bottles hanging on the wall,\n"
            + "Two green bottles hanging on the wall,\n"
            + "And if one green bottle should accidentally fall,\n"
            + "There'll be one green bottle hanging on the wall.\n"
            + "\n"
            + "One green bottle hanging on the wall,\n"
            + "One green bottle hanging on the wall,\n"
            + "If that one green bottle should accidentally fall,\n"
            + "There'll be no green bottles hanging on the wall.\n";
    assertEquals(expected, Dinglemouse.tenGreenBottles(2));
  }
}
