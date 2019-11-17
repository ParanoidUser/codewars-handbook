import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AlternateSquareSumTest {
  @Test
  public void exampleTest() {
    assertEquals(379, Kata.alternateSqSum(new int[] {11, 12, 13, 14, 15}));
    assertEquals(368, Kata.alternateSqSum(new int[] {13, 12, 8, 8, 9, 10, 5, 5}));
  }
}
