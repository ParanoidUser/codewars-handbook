import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RunLengthEncodingTests {
  @Test
  public void testEncode() {
    assertEquals("1A", RunLengthEncoding.encode("A"));
    assertEquals("3A", RunLengthEncoding.encode("AAA"));
    assertEquals("1A1B", RunLengthEncoding.encode("AB"));
    assertEquals("3A3B3C1A", RunLengthEncoding.encode("AAABBBCCCA"));
  }

  @Test
  public void testDecode() {
    assertEquals("A", RunLengthEncoding.decode("1A"));
    assertEquals("AAA", RunLengthEncoding.decode("3A"));
    assertEquals("AB", RunLengthEncoding.decode("1A1B"));
    assertEquals("AAABBBCCCA", RunLengthEncoding.decode("3A3B3C1A"));
  }

  @Test
  public void testRoundTrip() {
    assertEquals("AAAAAAAAAAB", RunLengthEncoding.decode(RunLengthEncoding.encode("AAAAAAAAAAB")));
    assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", RunLengthEncoding.decode(RunLengthEncoding.encode("ABCDEFGHIJKLMNOPQRSTUVWXYZ")));
  }
}
