import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("hi___fg", AlphabetWars.reinforcesMassacre(
        new String[]{
            "abcdefg",
            "hijklmn"
        }, new String[]{
            "   *   ",
            "*  *   "
        }));

    assertEquals("ccbaa", AlphabetWars.reinforcesMassacre(
        new String[]{
            "aaaaa",
            "bbbbb",
            "ccccc",
            "ddddd"
        },
        new String[]{
            "*",
            " *",
            "   "
        }));

    assertEquals("codewarsxxxx", AlphabetWars.reinforcesMassacre(
        new String[]{
            "g964xxxxxxxx",
            "myjinxin2015",
            "steffenvogel",
            "smile67xxxxx",
            "giacomosorbi",
            "freywarxxxxx",
            "bkaesxxxxxxx",
            "vadimbxxxxxx",
            "zozofouchtra",
            "colbydauphxx"
        }, new String[]{
            "* *** ** ***",
            " ** * * * **",
            " * *** * ***",
            " **  * * ** ",
            "* ** *   ***",
            "***   ",
            "**",
            "*",
            "*"
        }));
  }
}
