import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
class Student {
  private final String department;
  private final Gender gender;

  enum Gender {
    MALE, FEMALE
  }
}