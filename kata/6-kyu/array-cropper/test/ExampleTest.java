import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ExampleTest {
  @Test
  public void test() {
    int[][] sample = {
      {0, 1, 0, 0},
      {0, 0, 1, 0},
      {1, 1, 1, 0},
      {0, 0, 0, 0}
    };

    assertArrayEquals(new int[][] {
          {0, 1, 0},
          {0, 0, 1},
          {1, 1, 1}
        },
        ArrayCropper.getCroppedFieldAsArray(sample));
  }
}
