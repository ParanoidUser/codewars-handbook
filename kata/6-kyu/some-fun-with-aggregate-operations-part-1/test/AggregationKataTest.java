import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

class AggregationKataTest {
  @Test
  void sample() {
    var students = Stream.of(
        new Student(95, "Philology"),
        new Student(90, "CS"),
        new Student(82, "Philology"),
        new Student(60, "Philology"),
        new Student(65, "CS")
    );
    assertEquals(Map.of("CS", 77.5, "Philology", 79.0), AggregationKata.getAverageGradeByDepartment(students));
  }
}