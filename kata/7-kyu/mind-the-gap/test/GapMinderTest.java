import org.junit.Assert;
import org.junit.Test;

public class GapMinderTest {
  @Test
  public void testABC() {
    Assert.assertEquals("All carriages are present, so method should find 0 missing", 0, TrainInspector.countMissingCarriages("ABC"));
  }

  @Test
  public void testABD() {
    Assert.assertEquals("Carriage C is missing, so method should find 1 missing", 1, TrainInspector.countMissingCarriages("ABD"));
  }
}