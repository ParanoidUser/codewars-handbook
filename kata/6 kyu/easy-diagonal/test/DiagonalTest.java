import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

public class DiagonalTest {
  @Test
  public void test1() {
    assertEquals(BigInteger.valueOf(5985), Diagonal.diagonal(20, 3));
  }

  @Test
  public void test2() {
    assertEquals(BigInteger.valueOf(20349), Diagonal.diagonal(20, 4));
  }

  @Test
  public void test3() {
    assertEquals(BigInteger.valueOf(54264), Diagonal.diagonal(20, 5));
  }
}
