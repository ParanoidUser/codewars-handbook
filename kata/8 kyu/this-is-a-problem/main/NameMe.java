public class NameMe {
  public String firstName;
  public String lastName;
  public String fullName;

  public NameMe(String first, String last) {
    this.firstName = first;
    this.lastName = last;
    this.fullName = String.join(" ", firstName, lastName);
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getFullName() {
    return fullName;
  }
}
