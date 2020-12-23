interface AcronymGenerator {
  static String createAcronym(String lastName, String firstName) {
    var acronym = new StringBuilder();
    for (String name : (firstName + " " + lastName).split("[\\s-]")) {
      acronym.append(name.equalsIgnoreCase("von") ? 'v' : Character.toUpperCase(name.charAt(0)));
    }
    return acronym.toString();
  }
}
