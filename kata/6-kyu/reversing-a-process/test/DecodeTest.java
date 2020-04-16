import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DecodeTest {
  @Test
  public void test1() {
    assertEquals("uogbucwnddunktsjfanzlurnyxmx", Decode.decode("1273409kuqhkoynvvknsdwljantzkpnmfgf"));
    assertEquals("mfmwhbpoudfujjozopaugcb", Decode.decode("1544749cdcizljymhdmvvypyjamowl"));
    assertEquals("Impossible to decode", Decode.decode("1877138eieaqgumigywmicwgcgg"));
    assertEquals("rrsxppowmjsrclfljrajtybwviqb", Decode.decode("1122305vvkhrrcsyfkvejxjfvafzwpsdqgp"));
  }
}
