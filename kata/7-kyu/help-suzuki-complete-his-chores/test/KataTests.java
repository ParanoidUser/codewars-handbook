import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class KataTests {
  @Test
  public void choreAssignments_BasicTest1() {
    int[] expectedResult = new int[] {7, 7, 8};
    assertArrayEquals(expectedResult, Kata.choreAssignments(new int[] {5, 2, 1, 6, 4, 4}));
  }

  @Test
  public void choreAssignments_BasicTest2() {
    int[] expectedResult = new int[] {7, 8, 8, 10, 10, 11};
    assertArrayEquals(expectedResult, Kata.choreAssignments(new int[] {1, 5, 2, 8, 4, 9, 6, 4, 2, 2, 2, 9}));
  }

  @Test
  public void choreAssignments_BasicTest3() {
    int[] expectedResult = new int[] {10, 11, 11, 11, 11, 12, 12, 13};
    assertArrayEquals(expectedResult, Kata.choreAssignments(new int[] {5, 8, 3, 5, 3, 10, 5, 3, 10, 2, 4, 8, 7, 3, 9, 6}));
  }

  @Test
  public void choreAssignments_BasicTest4() {
    int[] expectedResult = new int[] {11, 11, 11, 12, 12, 12, 12, 12, 12};
    assertArrayEquals(expectedResult, Kata.choreAssignments(new int[] {9, 2, 10, 10, 5, 5, 8, 7, 4, 2, 8, 3, 6, 8, 7, 3, 6, 2}));
  }

  @Test
  public void choreAssignments_BasicTest5() {
    int[] expectedResult = new int[] {10, 10, 11, 11, 11, 11, 11, 11, 12, 12};
    assertArrayEquals(expectedResult, Kata.choreAssignments(new int[] {1, 6, 5, 5, 1, 10, 10, 9, 2, 10, 3, 9, 5, 4, 5, 6, 1, 9, 1, 8}));
  }
}
