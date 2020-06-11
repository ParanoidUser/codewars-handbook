
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class BinderTest {
  @Test
  void sample() {
    Binder<Integer, Integer> intToInt = new Binder<>();
    assertEquals(List.of(1, 2, 3), intToInt.bind(List.of(1, 2, 3), List::of));

    Binder<Integer, List<Integer>> intToList = new Binder<>();
    assertEquals(List.of(List.of(7), List.of(8), List.of(9)), intToList.bind(List.of(7, 8, 9), i -> List.of(List.of(i))));
    assertEquals(List.of(List.of(3, -3), List.of(4, -4), List.of(5, -5)), intToList.bind(List.of(3, 4, 5), i -> List.of(List.of(i, -i))));

    Binder<Integer, String> intToStr = new Binder<>();
    assertEquals(intToStr.bind(List.of(5, 6, 7), i -> List.of(i.toString())), List.of("5", "6", "7"));
  }
}
