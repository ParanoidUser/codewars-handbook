import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DecodeTest {
  @Test
  void sample() {
    assertEquals("uogbucwnddunktsjfanzlurnyxmx", Decode.decode("1273409kuqhkoynvvknsdwljantzkpnmfgf"));
    assertEquals("mfmwhbpoudfujjozopaugcb", Decode.decode("1544749cdcizljymhdmvvypyjamowl"));
    assertEquals("Impossible to decode", Decode.decode("1877138eieaqgumigywmicwgcgg"));
    assertEquals("rrsxppowmjsrclfljrajtybwviqb", Decode.decode("1122305vvkhrrcsyfkvejxjfvafzwpsdqgp"));
  }
}
