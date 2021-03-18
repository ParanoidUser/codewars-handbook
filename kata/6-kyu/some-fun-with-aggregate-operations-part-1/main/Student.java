import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
class Student {
  private final double grade;
  private final String department;
}