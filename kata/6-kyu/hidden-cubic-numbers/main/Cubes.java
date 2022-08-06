import java.util.ArrayList;

class Cubes {
  String isSumOfCubes(String s) {
    var cubes = new ArrayList<String>();
    for (String num : s.replaceAll("\\D", " ").trim().split("\\s+")) {
      for (String top3 : num.split("(?<=\\G...)")) {
        if (top3.equals(top3.chars().map(n -> (int) Math.pow(n - 48., 3)).sum() + "")) {
          cubes.add(top3);
        }
      }
    }
    return cubes.isEmpty() ? "Unlucky" : String.join(" ", cubes) + " " + cubes.stream().mapToInt(Integer::parseInt).sum() + " Lucky";
  }
}
