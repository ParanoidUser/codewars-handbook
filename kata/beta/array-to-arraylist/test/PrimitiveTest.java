import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class PrimitiveTest {
  @Test
  void sample() {
    var d2 = new Integer[][]{{1, 2}, {3, 4}};
    assertEquals(List.of(d2[0], d2[1]), Maker.make(d2));
    assertEquals(List.of(List.of(0, 1, 2), List.of(3, 4, 5), List.of(6, 7, 8)), Maker.make(new List[]{List.of(0, 1, 2), List.of(3, 4, 5), List.of(6, 7, 8)}));
    assertEquals(List.of("hey", "bye", "cat"), Maker.make(new String[]{"hey", "bye", "cat"}));
    assertEquals(List.of((byte) 1, (byte) 2, (byte) 3, (byte) -1), Maker.make(new byte[]{1, 2, 3, -1}));
    assertEquals(List.of((short) 1, (short) 2, (short) 3), Maker.make(new short[]{1, 2, 3}));
    assertEquals(List.of(1, 2, 3), Maker.make(new int[]{1, 2, 3}));
    assertEquals(List.of(1L, 2L, 3L), Maker.make(new long[]{1L, 2L, 3L}));
    assertEquals(List.of(1.2f, 2f, 3.9f, -4.4f, 5.7f), Maker.make(new float[]{1.2f, 2f, 3.9f, -4.4f, 5.7f}));
    assertEquals(List.of(1.2769, 2.888, 3.91, -4.45, 5.69), Maker.make(new double[]{1.2769, 2.888, 3.91, -4.45, 5.69}));
    assertEquals(List.of(true, false), Maker.make(new boolean[]{true, false}));
    assertEquals(List.of('X'), Maker.make(new char[]{'X'}));
  }
}