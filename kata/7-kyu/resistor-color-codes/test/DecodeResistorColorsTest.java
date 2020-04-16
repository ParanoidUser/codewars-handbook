import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DecodeResistorColorsTest {
  @Test
  public void testOne() {
    assertEquals("47 ohms, 20%", DecodeResistorColors.decodeResistorColors("yellow violet black"));
  }

  @Test
  public void testTwo() {
    assertEquals("4.7k ohms, 5%", DecodeResistorColors.decodeResistorColors("yellow violet red gold"));
  }

  @Test
  public void testThree() {
    assertEquals("1M ohms, 10%", DecodeResistorColors.decodeResistorColors("brown black green silver"));
  }
}
