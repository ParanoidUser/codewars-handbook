import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class BinderTest {
  @Test
  public void testBinding() {
    Binder<Integer, Integer> binder1 = new Binder<>();
    List<Integer> list = List.of(1, 2, 3);
    assertEquals(List.of(1, 2, 3), binder1.bind(list, List::of));

    Binder<Integer, List<Integer>> binder2 = new Binder<>();
    list = List.of(7, 8, 9);
    assertEquals(List.of(List.of(7), List.of(8), List.of(9)), binder2.bind(list, i -> List.of(List.of(i))));

    list = List.of(3, 4, 5);
    assertEquals(List.of(List.of(3, -3), List.of(4, -4), List.of(5, -5)), binder2.bind(list, i -> List.of(List.of(i, -i))));

    Binder<Integer, String> binder3 = new Binder<>();
    list = List.of(5, 6, 7);
    assertEquals(binder3.bind(list, i -> List.of(i.toString())), List.of("5", "6", "7"));
  }
}
