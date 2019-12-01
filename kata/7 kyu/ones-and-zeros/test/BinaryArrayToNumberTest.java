import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class BinaryArrayToNumberTest {
  @Test
  public void convertBinaryArrayToInt() {
    assertEquals(1, BinaryArrayToNumber.ConvertBinaryArrayToInt(List.of(0, 0, 0, 1)));
    assertEquals(15, BinaryArrayToNumber.ConvertBinaryArrayToInt(List.of(1, 1, 1, 1)));
    assertEquals(6, BinaryArrayToNumber.ConvertBinaryArrayToInt(List.of(0, 1, 1, 0)));
    assertEquals(9, BinaryArrayToNumber.ConvertBinaryArrayToInt(List.of(1, 0, 0, 1)));
  }
}
