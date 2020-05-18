import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SampleTests {
  @Test
  void sample() {
    assertEquals(List.of(22, 25, 27, 32, 33, 35, 52, 55, 57, 72, 75, 77), Solution.notPrimes(2, 222));
    assertEquals(List.of(2722, 2723, 2725, 2727, 2732, 2733, 2735, 2737, 2752, 2755, 2757, 2772, 2773, 2775), Solution.notPrimes(2700, 3000));
    assertEquals(List.of(522, 525, 527, 532, 533, 535, 537, 552, 553, 555, 572, 573, 575, 722, 723, 725, 732, 735, 737, 752, 753, 755, 772, 775, 777), Solution.notPrimes(500, 999));
    assertEquals(List.of(2222, 2223, 2225, 2227, 2232, 2233, 2235, 2252, 2253, 2255, 2257, 2272, 2275, 2277, 2322, 2323, 2325, 2327, 2332, 2335, 2337, 2352, 2353, 2355, 2372, 2373, 2375), Solution.notPrimes(999, 2500));
  }
}