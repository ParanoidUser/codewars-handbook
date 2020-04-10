import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EmailDomainTest {
  @Test
  void test() {
    assertEquals("example.com", EmailDomain.findEmailDomain("prettyandsimple@example.com"));
    assertEquals("example.org", EmailDomain.findEmailDomain("<>[]:,;@\"!#$%&*+-/=?^_{}| ~.a\"@example.org"));
    assertEquals("yandex.ru", EmailDomain.findEmailDomain("someaddress@yandex.ru"));
    assertEquals("xample.org", EmailDomain.findEmailDomain("\" \"@xample.org"));
  }
}