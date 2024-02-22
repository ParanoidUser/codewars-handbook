import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTests {
  @Test
  void sample() {
    assertEquals("""
            Dentzil;myjinxin2015;raulbc777;smile67;SteffenVogel_79
            3907;17945;10091;10088;10132
            48;2;12;13;11""",
        Kata.sortCsvColumns("""
            myjinxin2015;raulbc777;smile67;Dentzil;SteffenVogel_79
            17945;10091;10088;3907;10132
            2;12;13;48;11"""));

    assertEquals("""
            Captain America;Hulk;IronMan;Thor
            honorably;angry;arrogant;divine
            shield;greenhorn;armor;hammer
            Steven;Bruce;Tony;Thor""",
        Kata.sortCsvColumns("""
            IronMan;Thor;Captain America;Hulk
            arrogant;divine;honorably;angry
            armor;hammer;shield;greenhorn
            Tony;Thor;Steven;Bruce"""));
  }
}