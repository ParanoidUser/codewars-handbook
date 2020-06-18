import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class GreatestSmallestTests {
  @Test
  void sample() {
    assertEquals(new BigInteger("0"), GreatestSmallest.greatest(new BigInteger("13"), new BigInteger("17"), new BigInteger("100")));
    assertEquals(new BigInteger("0"), GreatestSmallest.greatest(new BigInteger("10"), new BigInteger("100"), new BigInteger("100")));
    assertEquals(new BigInteger("18"), GreatestSmallest.greatest(new BigInteger("2"), new BigInteger("3"), new BigInteger("20")));
    assertEquals(new BigInteger("8565894632610"), GreatestSmallest.greatest(new BigInteger("51735"), new BigInteger("77238"), new BigInteger("8567205540015")));
    assertEquals(new BigInteger("9000000144000000567"), GreatestSmallest.greatest(new BigInteger("1000000007"), new BigInteger("1000000009"), new BigInteger("10000000000000000000")));

    assertEquals(new BigInteger("24"), GreatestSmallest.smallest(new BigInteger("2"), new BigInteger("3"), new BigInteger("20")));
    assertEquals(new BigInteger("221"), GreatestSmallest.smallest(new BigInteger("13"), new BigInteger("17"), new BigInteger("100")));
    assertEquals(new BigInteger("200"), GreatestSmallest.smallest(new BigInteger("10"), new BigInteger("100"), new BigInteger("100")));
    assertEquals(new BigInteger("8567226601920"), GreatestSmallest.smallest(new BigInteger("51735"), new BigInteger("77238"), new BigInteger("8567205540015")));
    assertEquals(new BigInteger("10000000160000000630"), GreatestSmallest.smallest(new BigInteger("1000000007"), new BigInteger("1000000009"), new BigInteger("10000000000000000000")));
  }
}