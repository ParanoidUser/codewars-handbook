import static java.util.Map.entry;

import java.util.Map;

final class Helper {
  static final Map<Character, String> NATO = Map.ofEntries(
      entry('A', "Alfa"),
      entry('B', "Bravo"),
      entry('C', "Charlie"),
      entry('D', "Delta"),
      entry('E', "Echo"),
      entry('F', "Foxtrot"),
      entry('G', "Golf"),
      entry('H', "Hotel"),
      entry('I', "India"),
      entry('J', "Juliett"),
      entry('K', "Kilo"),
      entry('L', "Lima"),
      entry('M', "Mike"),
      entry('N', "November"),
      entry('O', "Oscar"),
      entry('P', "Papa"),
      entry('Q', "Quebec"),
      entry('R', "Romeo"),
      entry('S', "Sierra"),
      entry('T', "Tango"),
      entry('U', "Uniform"),
      entry('V', "Victor"),
      entry('W', "Whiskey"),
      entry('X', "Xray"),
      entry('Y', "Yankee"),
      entry('Z', "Zulu")
  );

  private Helper() {}
}