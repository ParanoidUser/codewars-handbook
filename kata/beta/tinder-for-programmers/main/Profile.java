import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
class Profile {
  private final String name;
  private final Integer age;
  private final String bio;
}