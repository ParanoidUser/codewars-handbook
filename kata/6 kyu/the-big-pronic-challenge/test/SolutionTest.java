import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void isPronicTests() {
    for (int p = 24; p <= 31; p++) {
      long basis = 1L << p;
      for (int i = 0; i < 10000; i++) {
        long cand = basis + i;
        long pronic = cand * (cand + 1);
        assertTrue(Kata.isPronic(pronic));
      }
    }
    long basis = 185363L << 14;
    for (int i = 0; i < 10000; i++) {
      long cand = basis + i;
      long pronic = cand * (cand + 1);
      assertTrue(Kata.isPronic(pronic));
    }
  }

  @Test
  public void isNotPronicTests() {
    for (int p = 24; p <= 31; p++) {
      long basis = 1L << p;
      for (int i = 0; i < 10000; i++) {
        long cand = basis + i;
        long pronic = cand * (cand + 1) - 1;
        assertFalse(Kata.isPronic(pronic));
      }
    }
    long basis = 185363L << 14;
    for (int i = 0; i < 10000; i++) {
      long cand = basis + i;
      long pronic = cand * (cand + 1) - 1;
      assertFalse(Kata.isPronic(pronic));
    }
  }

  @Test
  public void individualPronicTests() {
    assertTrue(Kata.isPronic(0));
    assertTrue(Kata.isPronic(2));
    assertTrue(Kata.isPronic(6));
    assertTrue(Kata.isPronic(12));
    assertTrue(Kata.isPronic(20));
    assertTrue(Kata.isPronic(30));
    assertTrue(Kata.isPronic(42));
    assertTrue(Kata.isPronic(9223372033963249500L));
    assertFalse(Kata.isPronic(1));
    assertFalse(Kata.isPronic(Long.MIN_VALUE));
    assertFalse(Kata.isPronic(Long.MIN_VALUE / 2));
    assertFalse(Kata.isPronic(Long.MAX_VALUE));
  }

  @Test
  public void randomTests() {
    Random r = new Random();
    for (int i = 0; i < 100000; i++) {
      long cand;
      // Prevent 0 from being passed into pronic test, and prevent overflow.
      while ((cand = (long) Math.sqrt(r.nextLong() >> 1)) == 0);
      if (cand > 0) {
        long pronic = cand * (cand - 1);
        assertTrue(Kata.isPronic(pronic));
        assertFalse(Kata.isPronic(pronic - 2));
      } else {
        assertFalse(Kata.isPronic(cand * (cand - 1)));
      }
    }
  }
}
