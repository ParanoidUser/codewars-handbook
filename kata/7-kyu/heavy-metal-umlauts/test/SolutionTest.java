import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void basicTest1() {
    String actual = HeavyMetalUmlauts.heavyMetalUmlauts("Announcing the Macbook Air Guitar");
    assertEquals("Ännöüncïng thë Mäcböök Äïr Güïtär", actual);
  }

  @Test
  void basicTest2() {
    String actual = HeavyMetalUmlauts.heavyMetalUmlauts("Facebook introduces new heavy metal reaction buttons");
    assertEquals("Fäcëböök ïntrödücës nëw hëävÿ mëtäl rëäctïön büttöns", actual);
  }

  @Test
  void basicTest3() {
    String actual = HeavyMetalUmlauts.heavyMetalUmlauts("Strong sales of Google's VR Metalheadsets send tech stock prices soaring");
    assertEquals("Ströng sälës öf Gööglë's VR Mëtälhëädsëts sënd tëch stöck prïcës söärïng", actual);
  }

  @Test
  void basicTest4() {
    String actual = HeavyMetalUmlauts.heavyMetalUmlauts("Vegan Black Metal Chef hits the big time on Amazon TV");
    assertEquals("Vëgän Bläck Mëtäl Chëf hïts thë bïg tïmë ön Ämäzön TV", actual);
  }
}
