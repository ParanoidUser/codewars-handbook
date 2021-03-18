import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

class AggregationKataTest {
  @Test
  void sample() {
    var students = Stream.of(
        new Student("Philology"),
        new Student("CS"),
        new Student("Philology"),
        new Student("Philology"),
        new Student("CS")
    );
    assertEquals(Map.of("CS", 2L, "Philology", 3L), AggregationKata.getNumberOfStudentsByDepartment(students));
  }
}