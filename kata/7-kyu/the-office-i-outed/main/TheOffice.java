import static java.util.Arrays.stream;

interface TheOffice {
  static String outed(Person[] meet, String boss) {
    return stream(meet).mapToInt(p -> p.happiness * (p.name.equals(boss) ? 2 : 1))
                       .average().orElse(0) > 5 ? "Nice Work Champ!" : "Get Out Now!";
  }
}
