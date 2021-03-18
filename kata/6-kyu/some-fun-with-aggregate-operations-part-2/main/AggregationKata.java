import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Map;
import java.util.stream.Stream;

interface AggregationKata {
  static Map<String, Long> getNumberOfStudentsByDepartment(Stream<Student> students) {
    return students.collect(groupingBy(Student::getDepartment, counting()));
  }
}