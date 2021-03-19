import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
class Student {
  private final String department;
  private final Gender gender;

  public enum Gender {
    MALE, FEMALE
  }
}