class NameMe {
  final String firstName;
  final String lastName;
  final String fullName;

  NameMe(String first, String last) {
    this.firstName = first;
    this.lastName = last;
    this.fullName = String.join(" ", firstName, lastName);
  }

  String getFirstName() {
    return firstName;
  }

  String getLastName() {
    return lastName;
  }

  String getFullName() {
    return fullName;
  }
}
