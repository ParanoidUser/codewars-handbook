import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RankTest {
  @Test
  void sample() {
    assertEquals("No participants", Rank.nthRank("", new Integer[]{4, 2, 1, 4, 3, 1, 2}, 4));
    assertEquals("Not enough participants", Rank.nthRank("Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin", new Integer[]{4, 2, 1, 4, 3, 1, 2}, 8));
    assertEquals("Benjamin", Rank.nthRank("Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin", new Integer[]{4, 2, 1, 4, 3, 1, 2}, 4));
    assertEquals("Matthew", Rank.nthRank("Elijah,Chloe,Elizabeth,Matthew,Natalie,Jayden", new Integer[]{1, 3, 5, 5, 3, 6}, 2));
    assertEquals("Abigail", Rank.nthRank("Aubrey,Olivai,Abigail,Chloe,Andrew,Elizabeth", new Integer[]{3, 1, 4, 4, 3, 2}, 4));
  }
}
