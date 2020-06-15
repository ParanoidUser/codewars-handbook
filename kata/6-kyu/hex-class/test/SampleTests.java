import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTests {
  @Test
  void sample() {
    Hex ff = new Hex(255);
    assertEquals("0xFF", ff.toString());
    assertEquals(256, ff.valueOf() + 1);
    assertEquals("0xFF", ff.toJSON());
    assertEquals(ff, new Hex(255));
    assertEquals("0xFE", ff.minus(1).toString());
    assertEquals("0x0", ff.minus(ff).toString());
    assertEquals("0xF", new Hex(10).plus(5).toString());
    assertEquals("0x1FE", ff.plus(ff).toString());
    assertEquals(32, Hex.parse("0x20"));
    assertEquals(512, Hex.parse("200"));
  }
}