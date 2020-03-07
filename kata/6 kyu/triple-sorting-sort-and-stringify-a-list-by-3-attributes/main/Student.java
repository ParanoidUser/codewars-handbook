import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class Student {
    private final int age;
    private final int gpa;
    private final String fullName;
}