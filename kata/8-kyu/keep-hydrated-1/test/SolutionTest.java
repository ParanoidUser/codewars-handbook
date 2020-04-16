import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void SampleTest1() {
    assertEquals(1, KeepHydrated.Liters(2));
  }

  @Test
  public void SampleTest2() {
    assertEquals(0, KeepHydrated.Liters(0.97));
  }

  @Test
  public void SampleTest3() {
    assertEquals(7, KeepHydrated.Liters(14.64));
  }

  @Test
  public void SampleTest4() {
    assertEquals(800, KeepHydrated.Liters(1600.20));
  }

  @Test
  public void SampleTest5() {
    assertEquals(40, KeepHydrated.Liters(80));
  }
}
