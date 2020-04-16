import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class Tests {
  @Test
  public void ex() {
    String[] linesOrig =
        new String[] {
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
        };

    List<String> lines = new ArrayList<>(Arrays.asList(linesOrig));
    Collections.shuffle(lines);
    lines.sort(new Dinglemouse.HelpSaveChristmas());
    assertArrayEquals(linesOrig, lines.toArray());
  }
}
