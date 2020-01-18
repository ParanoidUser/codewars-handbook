import org.junit.Assert;
import org.junit.Test;

public class SpyGraduationExampleTests {
  @Test
  public void basicTests() {
    char[] expected = new char[] {24916, 25185, 25454, 24932, 25209};
    Assert.assertEquals("Tandy", SpyGraduation.decrypt(String.valueOf(expected)));

    expected = new char[] {17011, 20336, 20345, 19744, 17003, 20329, 20340};
    Assert.assertEquals("spy kit", SpyGraduation.decrypt(String.valueOf(expected)));

    expected = new char[] {20052, 20321, 8302, 19812, 16761};
    Assert.assertEquals("Tandy", SpyGraduation.decrypt(String.valueOf(expected)));
  }
}
