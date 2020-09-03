import java.util.function.Function;

final class FunctionalProgramming {
  private FunctionalProgramming() {}

  static final Function<Student, Boolean> f = s -> "js123".equals(s.studentNumber) && "John Smith".equals(s.getFullName());
}
