import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RoundAndRoundTest {
  @Test
  void sample() {
    double delta = 0.01;
    assertEquals(18.12D, RoundAndRound.roundTo2DecimalPlaces(18.123D), delta);
    assertEquals(16.77D, RoundAndRound.roundTo2DecimalPlaces(16.765D), delta);
    assertEquals(16.36D, RoundAndRound.roundTo2DecimalPlaces(16.355D), delta);
    assertEquals(7.48D, RoundAndRound.roundTo2DecimalPlaces(7.477D), delta);
    assertEquals(2D, RoundAndRound.roundTo2DecimalPlaces(2D), delta);
    assertEquals(1.46D, RoundAndRound.roundTo2DecimalPlaces(1.455D), delta);
    assertEquals(1.20D, RoundAndRound.roundTo2DecimalPlaces(1.1950000000000001D), delta);
    assertEquals(1.19D, RoundAndRound.roundTo2DecimalPlaces(1.1949999999999999D), delta);
    assertEquals(1.19D, RoundAndRound.roundTo2DecimalPlaces(1.1850000000000001D), delta);
    assertEquals(1.18D, RoundAndRound.roundTo2DecimalPlaces(1.1849999999999999D), delta);
    assertEquals(1.06D, RoundAndRound.roundTo2DecimalPlaces(1.055D), delta);
    assertEquals(1.03D, RoundAndRound.roundTo2DecimalPlaces(1.025D), delta);
    assertEquals(0D, RoundAndRound.roundTo2DecimalPlaces(0D), delta);
    assertEquals(-5D, RoundAndRound.roundTo2DecimalPlaces(-4.999D), delta);
    assertEquals(-1.03D, RoundAndRound.roundTo2DecimalPlaces(-1.025D), delta);
    assertEquals(-1.06D, RoundAndRound.roundTo2DecimalPlaces(-1.055D), delta);
    assertEquals(-1.18D, RoundAndRound.roundTo2DecimalPlaces(-1.1849999999999999D), delta);
    assertEquals(-1.19D, RoundAndRound.roundTo2DecimalPlaces(-1.1850000000000001D), delta);
    assertEquals(-1.19D, RoundAndRound.roundTo2DecimalPlaces(-1.1949999999999999D), delta);
    assertEquals(-1.20D, RoundAndRound.roundTo2DecimalPlaces(-1.1950000000000001D), delta);
    assertEquals(-1.46D, RoundAndRound.roundTo2DecimalPlaces(-1.455D), delta);
    assertEquals(-16.35D, RoundAndRound.roundTo2DecimalPlaces(-16.345D), delta);
    assertEquals(-16.77D, RoundAndRound.roundTo2DecimalPlaces(-16.765D), delta);
  }
}