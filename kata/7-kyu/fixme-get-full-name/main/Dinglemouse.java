class Dinglemouse {
  String fullName;

  Dinglemouse(String firstName, String lastName) {
    fullName = firstName + " " + lastName;
  }

  String getFullName() {
    return fullName.trim();
  }
}
