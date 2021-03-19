import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

class AggregationKataTest {
  @Test
  void sample() {
    var students = Stream.of(
        new Student("Philology", Student.Gender.FEMALE),
        new Student("CS", Student.Gender.MALE),
        new Student("Philology", Student.Gender.MALE),
        new Student("Philology", Student.Gender.MALE),
        new Student("CS", Student.Gender.FEMALE)
    );
    assertEquals(Map.of(
        "CS", Map.of(Student.Gender.MALE, 1L, Student.Gender.FEMALE, 1L),
        "Philology", Map.of(Student.Gender.MALE, 2L, Student.Gender.FEMALE, 1L)
    ), AggregationKata.getTheNumberOfStudentsByGenderForEachDepartment(students));
  }
}