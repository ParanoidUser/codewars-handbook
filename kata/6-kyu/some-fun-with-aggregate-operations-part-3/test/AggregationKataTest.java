import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

class AggregationKataTest {
  @Test
  void sample() {
    var students = Stream.of(
        new Student("Galina", "Philology"),
        new Student("Anton", "CS"),
        new Student("Jack", "Philology"),
        new Student("Mike", "Philology"),
        new Student("Jane", "CS")
    );
    assertEquals(Map.of(
        "Philology", List.of("Galina", "Jack", "Mike"),
        "CS", List.of("Anton", "Jane")
    ), AggregationKata.getStudentNamesByDepartment(students));
  }
}