import lombok.Builder;
import lombok.Value;

@Builder
@Value
class People {
  private static final String GREET = "hello my name is ";
  String name;
  String lastName;
  String city;
  String job;
  int age;

  String greet() {
    return GREET + name;
  }
}
