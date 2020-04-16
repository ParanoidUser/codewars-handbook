import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  private String[] reinforces = {
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
  };
  private String[] aristrikes = {
    "* *** ** ***",
    " ** * * * **",
    " * *** * ***",
    " **  * * ** ",
    "* ** *   ***",
    "***   ",
    "**",
    "*",
    "*"
  };

  @Test
  public void sampleTests() {
    assertEquals("codewarsxxxx", AlphabetWars.reinforcesMassacre(reinforces, aristrikes));
    assertEquals("hi___fg", AlphabetWars.reinforcesMassacre(new String[] {"abcdefg", "hijklmn"}, new String[] {"   *   ", "*  *   "}));
    assertEquals("ccbaa", AlphabetWars.reinforcesMassacre(new String[] {"aaaaa", "bbbbb", "ccccc", "ddddd"}, new String[] {"*", " *", "   "}));
  }
}
