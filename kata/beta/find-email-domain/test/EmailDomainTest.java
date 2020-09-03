import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EmailDomainTest {
  @Test
  void sample() {
    assertEquals("example.com", new EmailDomain().findEmailDomain("prettyandsimple@example.com"));
    assertEquals("example.org", new EmailDomain().findEmailDomain("<>[]:,;@\"!#$%&*+-/=?^_{}| ~.a\"@example.org"));
    assertEquals("yandex.ru", new EmailDomain().findEmailDomain("someaddress@yandex.ru"));
    assertEquals("xample.org", new EmailDomain().findEmailDomain("\" \"@xample.org"));
  }
}