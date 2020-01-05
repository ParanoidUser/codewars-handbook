import java.util.function.Function;

class FunctionalProgramming {
  static Function<Student, Boolean> f = s -> "js123".equals(s.studentNumber) && "John Smith".equals(s.getFullName());
}
