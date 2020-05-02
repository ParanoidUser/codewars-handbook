import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class TripleSorterTest {
  @Test
  void sample() {
    var students = List.of(
        new Student(23, 88, "David Goodman"),
        new Student(25, 82, "Mark Rose"),
        new Student(22, 90, "Jane Doe"),
        new Student(25, 90, "Jane Dane"));
    assertEquals("Jane Doe,Jane Dane,David Goodman,Mark Rose", TripleSorter.sort(students));
  }
}
