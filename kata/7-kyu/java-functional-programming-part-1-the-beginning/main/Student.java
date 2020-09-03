import lombok.AllArgsConstructor;

@AllArgsConstructor
class Student {
  private final String firstName;
  private final String lastName;
  final String studentNumber;

  String getFullName() {
    return firstName + " " + lastName;
  }
}
