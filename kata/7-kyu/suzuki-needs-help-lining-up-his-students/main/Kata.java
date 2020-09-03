import static java.util.Comparator.reverseOrder;
import static java.util.stream.Stream.of;

interface Kata {
  static String[] lineupStudents(String students) {
    return of(students.split(" ")).sorted(reverseOrder()).sorted((a, b) -> b.length() - a.length()).toArray(String[]::new);
  }
}
