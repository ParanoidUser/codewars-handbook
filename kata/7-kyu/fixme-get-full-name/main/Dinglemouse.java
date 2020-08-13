class Dinglemouse {
  private final String fullName;

  Dinglemouse(String firstName, String lastName) {
    fullName = (firstName + " " + lastName).trim();
  }

  String getFullName() {
    return fullName;
  }
}
