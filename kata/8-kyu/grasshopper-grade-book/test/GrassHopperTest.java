import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GrassHopperTest {
  @Test
  void testA() {
    assertEquals('A', GrassHopper.getGrade(95, 90, 93));
    assertEquals('A', GrassHopper.getGrade(100, 85, 96));
    assertEquals('A', GrassHopper.getGrade(92, 93, 94));
    assertEquals('A', GrassHopper.getGrade(100, 100, 100));
  }

  @Test
  void testB() {
    assertEquals('B', GrassHopper.getGrade(70, 70, 100));
    assertEquals('B', GrassHopper.getGrade(82, 85, 87));
    assertEquals('B', GrassHopper.getGrade(84, 79, 85));
  }

  @Test
  void testC() {
    assertEquals('C', GrassHopper.getGrade(70, 70, 70));
    assertEquals('C', GrassHopper.getGrade(75, 70, 79));
    assertEquals('C', GrassHopper.getGrade(60, 82, 76));
  }

  @Test
  void testD() {
    assertEquals('D', GrassHopper.getGrade(65, 70, 59));
    assertEquals('D', GrassHopper.getGrade(66, 62, 68));
    assertEquals('D', GrassHopper.getGrade(58, 62, 70));
  }

  @Test
  void testF() {
    assertEquals('F', GrassHopper.getGrade(44, 55, 52));
    assertEquals('F', GrassHopper.getGrade(48, 55, 52));
    assertEquals('F', GrassHopper.getGrade(58, 59, 60));
    assertEquals('F', GrassHopper.getGrade(0, 0, 0));
  }
}
