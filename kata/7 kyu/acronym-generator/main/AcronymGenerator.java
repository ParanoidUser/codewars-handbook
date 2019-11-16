class AcronymGenerator {
  static String createAcronym(String lastName, String firstName) {
    String acronym = "";
    for (String name : (firstName + " " + lastName).split("\\s|-")) {
      acronym += name.equalsIgnoreCase("von") ? 'v' : Character.toUpperCase(name.charAt(0));
    }
    return acronym;
  }
}
