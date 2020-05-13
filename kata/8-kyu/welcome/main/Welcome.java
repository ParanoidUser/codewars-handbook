import static java.util.Map.entry;
import static java.util.Map.ofEntries;

interface Welcome {
  static String greet(String language) {
    return ofEntries(
            entry("czech", "Vitejte"),
            entry("danish", "Velkomst"),
            entry("dutch", "Welkom"),
            entry("estonian", "Tere tulemast"),
            entry("finnish", "Tervetuloa"),
            entry("flemish", "Welgekomen"),
            entry("french", "Bienvenue"),
            entry("german", "Willkommen"),
            entry("irish", "Failte"),
            entry("italian", "Benvenuto"),
            entry("latvian", "Gaidits"),
            entry("lithuanian", "Laukiamas"),
            entry("polish", "Witamy"),
            entry("spanish", "Bienvenido"),
            entry("swedish", "Valkommen"),
            entry("welsh", "Croeso"))
        .getOrDefault(language, "Welcome");
  }
}
