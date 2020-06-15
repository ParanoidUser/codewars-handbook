import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTest {
  @Test
  void sample() {
    assertEquals("A triceratops is eating something.", JurassicWord.lunchTime("iiiuuVuu|||"));
    assertEquals("Something is eating something.", JurassicWord.lunchTime("uVuuVuuVuuu"));
    assertEquals("A T-Rex is eating a dead dino.", JurassicWord.lunchTime("_CVvvvVC}>"));
    assertEquals("A triceratops is eating flowers.", JurassicWord.lunchTime("iiiuuVuuiii"));
    assertEquals("Something is eating leaves.", JurassicWord.lunchTime("|||uuVuu|||"));
    assertEquals("A T-Rex is eating something.", JurassicWord.lunchTime("iwsVvvvVdp/"));
  }
}