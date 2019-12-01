import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleTests {
  @Test
  public void exampleTests() {
    assertEquals(21784, Kata.arrayPacking(new int[] {24, 85, 0}));
    assertEquals(2567447, Kata.arrayPacking(new int[] {23, 45, 39}));
    assertEquals(257, Kata.arrayPacking(new int[] {1, 1}));
    assertEquals(0, Kata.arrayPacking(new int[] {0}));
    assertEquals(4294967295L, Kata.arrayPacking(new int[] {255, 255, 255, 255}));
  }
}
