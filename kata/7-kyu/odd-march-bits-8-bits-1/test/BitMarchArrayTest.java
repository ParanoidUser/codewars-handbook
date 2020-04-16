import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;

import org.junit.Test;

public class BitMarchArrayTest {
  @Test
  public void test5() {
    int[][] bits = {
      {0, 0, 0, 1, 1, 1, 1, 1},
      {0, 0, 1, 1, 1, 1, 1, 0},
      {0, 1, 1, 1, 1, 1, 0, 0},
      {1, 1, 1, 1, 1, 0, 0, 0},
    };
    int[][] chosenBits = BitMarchArray.BitMarch(5);
    assertNotNull(chosenBits);
    assertEquals(4, chosenBits.length);
    assertEquals(0, chosenBits[2][7]);
    assertNotEquals(chosenBits[0], chosenBits[1]);
    assertNotEquals(chosenBits[2], chosenBits[3]);
    assertNotNull(chosenBits);
    assertThat(Arrays.asList(bits), hasItems(chosenBits));
  }

  @Test
  public void test7() {
    int[][] bits = {
      {0, 1, 1, 1, 1, 1, 1, 1},
      {1, 1, 1, 1, 1, 1, 1, 0},
    };
    int[][] chosenBits = BitMarchArray.BitMarch(7);
    assertNotNull(chosenBits);
    assertEquals(2, chosenBits.length);
    assertEquals(0, chosenBits[1][7]);
    assertNotEquals(chosenBits[0], chosenBits[1]);
    assertNotNull(chosenBits);
    assertThat(Arrays.asList(bits), hasItems(chosenBits));
  }

  @Test
  public void test8() {
    int[][] bits = {
      {1, 1, 1, 1, 1, 1, 1, 1},
    };
    int[][] chosenBits = BitMarchArray.BitMarch(8);
    assertNotNull(chosenBits);
    assertEquals(1, chosenBits.length);
    assertEquals(1, chosenBits[0][7]);
    assertNotNull(chosenBits);
    assertThat(Arrays.asList(bits), hasItems(chosenBits));
  }
}
