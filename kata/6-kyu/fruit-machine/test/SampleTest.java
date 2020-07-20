import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals(100, Solution.fruit(new String[][]{
        {"Wild", "Star", "Bell", "Shell", "Seven", "Cherry", "Bar", "King", "Queen", "Jack"},
        {"Wild", "Star", "Bell", "Shell", "Seven", "Cherry", "Bar", "King", "Queen", "Jack"},
        {"Wild", "Star", "Bell", "Shell", "Seven", "Cherry", "Bar", "King", "Queen", "Jack"}
    }, new int[]{0, 0, 0}));

    assertEquals(0, Solution.fruit(new String[][]{
        {"Wild", "Star", "Bell", "Shell", "Seven", "Cherry", "Bar", "King", "Queen", "Jack"},
        {"Bar", "Wild", "Queen", "Bell", "King", "Seven", "Cherry", "Jack", "Star", "Shell"},
        {"Bell", "King", "Wild", "Bar", "Seven", "Jack", "Shell", "Cherry", "Queen", "Star"}
    }, new int[]{5, 4, 3}));

    assertEquals(3, Solution.fruit(new String[][]{
        {"King", "Cherry", "Bar", "Jack", "Seven", "Queen", "Star", "Shell", "Bell", "Wild"},
        {"Bell", "Seven", "Jack", "Queen", "Bar", "Star", "Shell", "Wild", "Cherry", "King"},
        {"Wild", "King", "Queen", "Seven", "Star", "Bar", "Shell", "Cherry", "Jack", "Bell"}
    }, new int[]{0, 0, 1}));

    assertEquals(6, Solution.fruit(new String[][]{
        {"King", "Jack", "Wild", "Bell", "Star", "Seven", "Queen", "Cherry", "Shell", "Bar"},
        {"Star", "Bar", "Jack", "Seven", "Queen", "Wild", "King", "Bell", "Cherry", "Shell"},
        {"King", "Bell", "Jack", "Shell", "Star", "Cherry", "Queen", "Bar", "Wild", "Seven"}
    }, new int[]{0, 5, 0}));
  }
}
