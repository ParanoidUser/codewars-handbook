import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
  @Test
  public void basicTests() {
    char[][] input = new char[][] {
          {'a', 'b'},
          {'c', 'd'}
        };
    Assert.assertArrayEquals(new char[][] {
            {'a', 'c'},
            {'b', 'd'}
    }, JomoPipi.diagonalSort(input));

    char[][] t = new char[][] {
          {'1', 'd', '3'},
          {'e', '5', 'f'},
          {'H', 'I', '9'}
        };
    Assert.assertArrayEquals(new char[][] {
          {'1', '3', 'f'},
          {'d', '5', 'I'},
          {'e', 'H', '9'}
        }, JomoPipi.diagonalSort(t));

    char[][] t2 = new char[][] {
          {'1', '2', '3'},
          {'4', '5', '6'},
        };
    Assert.assertArrayEquals(new char[][] {
          {'1', '3', '5'},
          {'2', '4', '6'},
        }, JomoPipi.diagonalSort(t2));
  }
}
