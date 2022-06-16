import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {
  @Test
  void sample() {
    assertEquals(0, Main.name(new String[]{"mo", "re", "twi", "zzl", "ers"}));
    assertEquals(4, Main.name(new String[]{"k", "a", "t", "a"}));
    assertEquals(7, Main.name(new String[]{"co", "de", "w", "ar", "s"}));
    assertEquals(13, Main.name(new String[]{"give", "your", "kata", "a", "name"}));
    assertEquals(21, Main.name(new String[]{"oqm", "lpeosqjr", "hbtemwist", "ulfswgk", "ughk", "vywnbxb", "xkclp", "gfokemnh", "rxq", "frem", "wl", "hfdghivly", "sj", "ooqmobxji", "dhii"}));
    assertEquals(32, Main.name(new String[]{"tsqzc", "iqxzjscrq", "ezdcr", "rnamedb", "gei", "ofamn", "zaork", "odorwvhjnq", "uxy", "uvaxjckki", "xsa", "hswnecuv", "oga"}));
    assertEquals(34, Main.name(new String[]{"tlygs", "tcdia", "dnksr", "jwao", "lyqzinsjkz", "r", "eywogmjhie", "ogfexgsrp", "jtmftckdt", "wffbyso", "vblxjrff", "puukwcgmd", "of", "fpnegcdool", "wxbgyu", "chb"}));
  }
} 