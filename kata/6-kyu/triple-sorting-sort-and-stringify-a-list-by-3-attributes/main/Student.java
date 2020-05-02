import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
class Student {
    private final int age;
    private final int gpa;
    private final String fullName;
}