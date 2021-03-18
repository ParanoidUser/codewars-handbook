import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

interface AggregationKata {
  static Map<String, List<String>> getStudentNamesByDepartment(Stream<Student> students) {
    return students.collect(groupingBy(Student::getDepartment, mapping(Student::getName, toList())));
  }
}