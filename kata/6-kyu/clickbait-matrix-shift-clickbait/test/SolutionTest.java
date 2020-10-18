import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new char[][]{
        {'h', 'a', 'b', 'c'},
        {'d', '1', '2', '3'},
        {'4', 'c', 'o', 'd'},
        {'e', 'b', 'l', 'a'}
    }, JomoPipi.shift(new char[][]{
        {'a', 'b', 'c', 'd'},
        {'1', '2', '3', '4'},
        {'c', 'o', 'd', 'e'},
        {'b', 'l', 'a', 'h'}
    }, 1));

    assertArrayEquals(new char[][]{
        {'o', 'b', 'b', 'o'}
    }, JomoPipi.shift(new char[][]{
        {'b', 'o', 'o', 'b'}
    }, 2));

    assertArrayEquals(new char[][]{
        {'y', 'e', 'a'},
        {'m', 'm', 'm'}
    }, JomoPipi.shift(new char[][]{
        {'m', 'm', 'm'},
        {'y', 'e', 'a'}
    }, 3));
  }
}