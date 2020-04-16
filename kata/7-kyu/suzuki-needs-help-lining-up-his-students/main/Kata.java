import static java.util.Comparator.comparingInt;
import static java.util.function.Function.identity;
import static java.util.stream.Stream.of;

class Kata {
  static String[] lineupStudents(String students) {
    return of(students.split(" "))
        .sorted(comparingInt(String::length).thenComparing(identity()).reversed())
        .toArray(String[]::new);
  }
}
