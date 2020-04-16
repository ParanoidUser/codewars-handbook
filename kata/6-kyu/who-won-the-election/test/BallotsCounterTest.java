import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import org.junit.Test;

public class BallotsCounterTest {
  @Test
  public void testGetWinner_01() {
    assertThat(BallotsCounter.getWinner(List.of("A")), is("A"));
  }

  @Test
  public void testGetWinner_02() {
    assertThat(BallotsCounter.getWinner(List.of("A", "A", "A", "B", "B", "B", "A")), is("A"));
  }

  @Test
  public void testGetWinner_03() {
    assertThat(BallotsCounter.getWinner(List.of("A", "A", "A", "B", "B", "B")), is(nullValue()));
  }

  @Test
  public void testGetWinner_04() {
    assertThat(BallotsCounter.getWinner(List.of("A", "A", "A", "B", "C", "B")), is(nullValue()));
  }

  @Test
  public void testGetWinner_05() {
    assertThat(BallotsCounter.getWinner(List.of("A", "A", "B", "B", "C")), is(nullValue()));
  }
}
