import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

interface Kata {
  static String partsLeft(boolean... parts) {
    if (range(0, 8).allMatch(i -> parts[i])) {
      return "Your PC is ready to build!";
    }
    if (range(0, 8).noneMatch(i -> parts[i])) {
      return "No items bought!";
    }
    var names = new String[]{"CPU", "motherboard", "ram", "GPU", "hardDrive", "powerSupply", "desktopCase", "lights"};
    return range(0, 8).filter(i -> !parts[i]).mapToObj(i -> names[i]).collect(joining(", ")) + ".";
  }
}