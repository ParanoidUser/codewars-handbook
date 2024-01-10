import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UmbrellaTest {
  @Test
  void sample() {
    assertEquals(0, Umbrella.minUmbrellas(Weather.CLOUDY, Weather.WINDY, Weather.SUNNY));
    assertEquals(1, Umbrella.minUmbrellas(Weather.RAINY, Weather.RAINY, Weather.RAINY, Weather.RAINY));
    assertEquals(2, Umbrella.minUmbrellas(Weather.OVERCAST, Weather.RAINY, Weather.CLEAR, Weather.THUNDERSTORMS));
  }
}