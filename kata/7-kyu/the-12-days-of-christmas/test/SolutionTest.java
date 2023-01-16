import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    var lines = new String[]{
        "5 golden rings,",
        "4 calling birds,",
        "12 drummers drumming,",
        "On the 12th day of Christmas my true love gave to me",
        "8 maids a milking,",
        "7 swans a swimming,",
        "a partridge in a pear tree.",
        "2 turtle doves and",
        "6 geese a laying,",
        "11 pipers piping,",
        "3 French hens,",
        "10 lords a leaping,",
        "9 ladies dancing,"
    };

    Arrays.sort(lines, new Dinglemouse.HelpSaveChristmas());

    assertArrayEquals(new String[]{
        "On the 12th day of Christmas my true love gave to me",
        "12 drummers drumming,",
        "11 pipers piping,",
        "10 lords a leaping,",
        "9 ladies dancing,",
        "8 maids a milking,",
        "7 swans a swimming,",
        "6 geese a laying,",
        "5 golden rings,",
        "4 calling birds,",
        "3 French hens,",
        "2 turtle doves and",
        "a partridge in a pear tree."
    }, lines);
  }
}