import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.groupingBy;

import java.util.Map;
import java.util.stream.Stream;

interface AggregationKata {
  static Map<String, Double> getAverageGradeByDepartment(Stream<Student> students) {
    return students.collect(groupingBy(Student::getDepartment, averagingDouble(Student::getGrade)));
  }
}