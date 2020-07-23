import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTest {
  @Test
  void sample() {
    assertEquals("A velociraptor is eating a dead dino.", JurassicWord.lunchTime("_CvvvvvC}>"));
    assertEquals("A T-Rex is eating a dead dino.", JurassicWord.lunchTime("_CVvvvVC}>"));
    assertEquals("A triceratops is eating flowers.", JurassicWord.lunchTime("iiiuuVuuiii"));
    assertEquals("A brachiosaurus is eating leaves.", JurassicWord.lunchTime("|||uuuuu|||"));
    assertEquals("A triceratops is eating something.", JurassicWord.lunchTime("iiiuuVuu|||"));
    assertEquals("A T-Rex is eating something.", JurassicWord.lunchTime("iwsVvvvVdp/"));
    assertEquals("Something is eating a dead dino.", JurassicWord.lunchTime("_CuuVuuC}>"));
    assertEquals("Something is eating flowers.", JurassicWord.lunchTime("iiiVvvvViii"));
    assertEquals("Something is eating leaves.", JurassicWord.lunchTime("|||uuVuu|||"));
    assertEquals("Something is eating something.", JurassicWord.lunchTime("uVuuVuuVuuu"));
  }
}