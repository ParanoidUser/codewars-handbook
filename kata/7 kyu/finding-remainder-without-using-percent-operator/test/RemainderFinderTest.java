import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RemainderFinderTest {
  @Test
  public void basicTests() {
    assertEquals(new SimpleInteger(1), RemainderFinder.remainder(new SimpleInteger(3), new SimpleInteger(2)));
    assertEquals(new SimpleInteger(1), RemainderFinder.remainder(new SimpleInteger(19), new SimpleInteger(2)));
    assertEquals(new SimpleInteger(0), RemainderFinder.remainder(new SimpleInteger(10), new SimpleInteger(2)));
    assertEquals(new SimpleInteger(6), RemainderFinder.remainder(new SimpleInteger(34), new SimpleInteger(7)));
    assertEquals(new SimpleInteger(2), RemainderFinder.remainder(new SimpleInteger(27), new SimpleInteger(5)));
    assertNull(RemainderFinder.remainder(new SimpleInteger(27), new SimpleInteger(0)));
  }
}
