import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("Ännöüncïng thë Mäcböök Äïr Güïtär", HeavyMetalUmlauts.heavyMetalUmlauts("Announcing the Macbook Air Guitar"));
    assertEquals("Fäcëböök ïntrödücës nëw hëävÿ mëtäl rëäctïön büttöns", HeavyMetalUmlauts.heavyMetalUmlauts("Facebook introduces new heavy metal reaction buttons"));
    assertEquals("Vëgän Bläck Mëtäl Chëf hïts thë bïg tïmë ön Ämäzön TV", HeavyMetalUmlauts.heavyMetalUmlauts("Vegan Black Metal Chef hits the big time on Amazon TV"));
    assertEquals("Ströng sälës öf Gööglë's VR Mëtälhëädsëts sënd tëch stöck prïcës söärïng", HeavyMetalUmlauts.heavyMetalUmlauts("Strong sales of Google's VR Metalheadsets send tech stock prices soaring"));
  }
}
