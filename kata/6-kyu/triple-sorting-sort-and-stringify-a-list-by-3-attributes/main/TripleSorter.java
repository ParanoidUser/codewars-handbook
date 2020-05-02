import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.joining;

import java.util.List;

interface TripleSorter {
  static String sort(List<Student> students) {
    var comparator = comparing(Student::getGpa).reversed().thenComparing(s -> s.getFullName().split(" ")[1].charAt(0)).thenComparing(Student::getAge);
    return students.stream().sorted(comparator).map(Student::getFullName).collect(joining(","));
  }
}
