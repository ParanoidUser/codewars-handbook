import java.util.Random;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseTest {

  static class ReserveO extends Reverse {

    private int count;

    @Override
    public String reverse(String str) {
      count++;
      return super.reverse(str);
    }
  }

  ReserveO runner = new ReserveO();

  @Before
  public void setup() {
    runner.count = 0;
  }

  @Test
  public void should_test_predefined() {
    runner.reverse("hello world");
    Assert.assertEquals(runner.count, 11);
  }

  @Test
  public void should_test_30_randomized() {
    for (int i = 1; i < 30; i++) {
      runner.count = 0;
      String random = generator(i);
      String expected = new StringBuilder(random).reverse().toString();
      Assert.assertEquals(expected, runner.reverse(random));
      Assert.assertEquals(runner.count, random.length());
    }
  }

  private String generator(int n) {
    String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++)
      sb.append(symbols.charAt(new Random().nextInt(symbols.length())));

    return sb.toString();
  }
}
