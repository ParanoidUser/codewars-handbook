import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("978-1-85326-158-9", Solution.isbnConverter("1-85326-158-0"));
    assertEquals("978-0-14-143951-8", Solution.isbnConverter("0-14-143951-3"));
    assertEquals("978-0-02-346450-8", Solution.isbnConverter("0-02-346450-X"));
    assertEquals("978-963-14-2164-4", Solution.isbnConverter("963-14-2164-3"));
    assertEquals("978-1-7982-0894-6", Solution.isbnConverter("1-7982-0894-6"));
    assertEquals("978-1-2345-6788-0", Solution.isbnConverter("1-2345-6788-X"));
    assertEquals("978-1-2345-6781-1", Solution.isbnConverter("1-2345-6781-X"));
    assertEquals("978-1-2345-6784-2", Solution.isbnConverter("1-2345-6784-X"));
    assertEquals("978-1-2345-6787-3", Solution.isbnConverter("1-2345-6787-X"));
    assertEquals("978-1-2345-6780-4", Solution.isbnConverter("1-2345-6780-X"));
    assertEquals("978-1-2345-6783-5", Solution.isbnConverter("1-2345-6783-X"));
    assertEquals("978-1-2345-6786-6", Solution.isbnConverter("1-2345-6786-X"));
    assertEquals("978-1-2345-6789-7", Solution.isbnConverter("1-2345-6789-X"));
    assertEquals("978-1-2345-6782-8", Solution.isbnConverter("1-2345-6782-X"));
    assertEquals("978-1-2345-6785-9", Solution.isbnConverter("1-2345-6785-X"));
  }
}
