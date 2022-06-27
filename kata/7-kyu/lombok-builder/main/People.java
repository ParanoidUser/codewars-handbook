import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
class People {
  private static final String GREET = "hello my name is ";
  private final String name;
  private final String lastName;
  private final String city;
  private final String job;
  private final int age;

  String greet() {
    return GREET + name;
  }
}
