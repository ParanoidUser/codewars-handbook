import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StateTest {
  @Test
   void sample() {
    assertEquals("Massachusetts\n..... John Daggett 341 King Road Plymouth Massachusetts\n..... Sal Carpenter 73 6th Street Boston Massachusetts\n Virginia\n..... Alice Ford 22 East Broadway Richmond Virginia", State.byState("John Daggett, 341 King Road, Plymouth MA\nAlice Ford, 22 East Broadway, Richmond VA\nSal Carpenter, 73 6th Street, Boston MA"));
    assertEquals("California\n..... Amy Wilde 334 Bayshore Pkwy Mountain View California\n Massachusetts\n..... Eric Adams 20 Post Road Sudbury Massachusetts\n..... John Daggett 341 King Road Plymouth Massachusetts\n..... Sal Carpenter 73 6th Street Boston Massachusetts\n Oklahoma\n..... Orville Thomas 11345 Oak Bridge Road Tulsa Oklahoma\n Pennsylvania\n..... Terry Kalkas 402 Lans Road Beaver Falls Pennsylvania\n Virginia\n..... Alice Ford 22 East Broadway Richmond Virginia\n..... Hubert Sims 328A Brook Road Roanoke Virginia", State.byState("John Daggett, 341 King Road, Plymouth MA\nAlice Ford, 22 East Broadway, Richmond VA\nOrville Thomas, 11345 Oak Bridge Road, Tulsa OK\nTerry Kalkas, 402 Lans Road, Beaver Falls PA\nEric Adams, 20 Post Road, Sudbury MA\nHubert Sims, 328A Brook Road, Roanoke VA\nAmy Wilde, 334 Bayshore Pkwy, Mountain View CA\nSal Carpenter, 73 6th Street, Boston MA"));
  }
}
