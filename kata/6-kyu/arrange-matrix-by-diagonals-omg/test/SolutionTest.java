import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new char[][]{
        {'a', 'c'},
        {'b', 'd'}
    }, JomoPipi.diagonalSort(new char[][]{
        {'a', 'b'},
        {'c', 'd'}
    }));

    assertArrayEquals(new char[][]{
        {'1', '3', 'f'},
        {'d', '5', 'I'},
        {'e', 'H', '9'}
    }, JomoPipi.diagonalSort(new char[][]{
        {'1', 'd', '3'},
        {'e', '5', 'f'},
        {'H', 'I', '9'}
    }));

    assertArrayEquals(new char[][]{
        {'1', '3', '5'},
        {'2', '4', '6'},
    }, JomoPipi.diagonalSort(new char[][]{
        {'1', '2', '3'},
        {'4', '5', '6'},
    }));
  }
}
