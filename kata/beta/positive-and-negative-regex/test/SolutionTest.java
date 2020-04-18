
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sampleTests() {
    assertTrue("pot".matches(Kata.reg));
    assertTrue("support".matches(Kata.reg));
    assertTrue("Sparta".matches(Kata.reg));
    assertTrue("slap two".matches(Kata.reg));
    assertTrue("respite".matches(Kata.reg));
    assertTrue("deepest".matches(Kata.reg));
    assertTrue("stop-item".matches(Kata.reg));
    assertTrue("a spector".matches(Kata.reg));

    assertFalse("pt".matches(Kata.reg));
    assertFalse("Pot".matches(Kata.reg));
    assertFalse("pilates".matches(Kata.reg));
    assertFalse("pilot".matches(Kata.reg));
    assertFalse("parachute".matches(Kata.reg));
    assertFalse("spaghetti".matches(Kata.reg));
    assertFalse("tap".matches(Kata.reg));
  }

  @Test
  void randomTest() {
    assertTrue("aqapkqtkf".matches(Kata.reg));
    assertTrue("aoapkotke".matches(Kata.reg));
    assertTrue("akapkktka".matches(Kata.reg));
    assertTrue("awapkwtkj".matches(Kata.reg));
    assertTrue("bqbplqtlf".matches(Kata.reg));
    assertTrue("dwdpnwtnj".matches(Kata.reg));
    assertTrue("dodpnotne".matches(Kata.reg));
    assertTrue("dudpnutnh".matches(Kata.reg));
    assertTrue("fvfpqvtqi".matches(Kata.reg));
    assertTrue("hlhpultub".matches(Kata.reg));
    assertTrue("hvhpuvtui".matches(Kata.reg));
    assertTrue("jwjpwwtwj".matches(Kata.reg));
    assertTrue("iwipvwtvj".matches(Kata.reg));
    assertTrue("jqjpwqtwf".matches(Kata.reg));
    assertTrue("hohpuotue".matches(Kata.reg));

    assertFalse("bnbplnntld".matches(Kata.reg));
    assertFalse("eqepoqqtof".matches(Kata.reg));
    assertFalse("bkbplkktla".matches(Kata.reg));
    assertFalse("cncp nnt d".matches(Kata.reg));
    assertFalse("b bpl  tlc".matches(Kata.reg));
    assertFalse("cucp uut h".matches(Kata.reg));
    assertFalse("a apk  tkg".matches(Kata.reg));
  }
}