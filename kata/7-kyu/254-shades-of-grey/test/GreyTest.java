import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class GreyTest {
  @Test
  public void test() {
    assertArrayEquals("-1 should return an empty array", new String[0], ShadesOfGrey.shadesOfGrey(-1));
    assertArrayEquals("0 should return an empty array", new String[0], ShadesOfGrey.shadesOfGrey(0));
    assertArrayEquals("1 should return an array with #010101", new String[] {"#010101"}, ShadesOfGrey.shadesOfGrey(1));
  }
}
