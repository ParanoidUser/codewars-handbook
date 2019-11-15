import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;

public class EightiesKids1Test {
  @Test
  public void test1() {
    assertEquals("It took 260 licks to get to the tootsie roll center of a tootsie pop. The toughest challenge was freezing temps.", EightiesKids1.totalLicks(Map.of("freezing temps", 10, "clear skies", -2)));
  }

  @Test
  public void test2() {
    assertEquals("It took 245 licks to get to the tootsie roll center of a tootsie pop.", EightiesKids1.totalLicks(Map.of("happiness", -5, "clear skies", -2)));
  }

  @Test
  public void test3() {
    assertEquals("It took 252 licks to get to the tootsie roll center of a tootsie pop.", EightiesKids1.totalLicks(Map.of()));
  }

  @Test
  public void test4() {
    var env = Map.of("dragons", 100, "evil wizards", 110, "trolls", 50);
    assertEquals("It took 512 licks to get to the tootsie roll center of a tootsie pop. The toughest challenge was evil wizards.", EightiesKids1.totalLicks(env));
  }

  @Test
  public void test5() {
    assertEquals("It took 2 licks to get to the tootsie roll center of a tootsie pop.", EightiesKids1.totalLicks(Map.of("white magic", -250)));
  }
}
