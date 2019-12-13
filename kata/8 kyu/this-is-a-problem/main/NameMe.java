class NameMe {
  String firstName;
  String lastName;
  String fullName;

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
