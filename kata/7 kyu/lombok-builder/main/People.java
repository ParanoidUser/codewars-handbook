import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
class People {
  private static final String GREET = "hello my name is ";
  private String name, lastName, city, job;
  private int age;

  String greet() {
    return GREET + name;
  }
}
