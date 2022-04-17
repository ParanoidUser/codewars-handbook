import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertArrayEquals(new String[]{
        "HELLO",
        "ELLOH",
        "LLOHE",
        "LOHEL",
        "OHELL"
    }, Kata.scrollingText("hello"));

    assertArrayEquals(new String[]{
        "CODEWARS",
        "ODEWARSC",
        "DEWARSCO",
        "EWARSCOD",
        "WARSCODE",
        "ARSCODEW",
        "RSCODEWA",
        "SCODEWAR"
    }, Kata.scrollingText("codewars"));

    assertArrayEquals(new String[]{
        "GOOD LUCK!",
        "OOD LUCK!G",
        "OD LUCK!GO",
        "D LUCK!GOO",
        " LUCK!GOOD",
        "LUCK!GOOD ",
        "UCK!GOOD L",
        "CK!GOOD LU",
        "K!GOOD LUC",
        "!GOOD LUCK"
    }, Kata.scrollingText("good luck!"));
  }
}