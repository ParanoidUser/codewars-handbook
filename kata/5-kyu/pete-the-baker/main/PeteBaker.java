import java.util.Map;

interface PeteBaker {
  static int cakes(Map<String, Integer> recipe, Map<String, Integer> ings) {
    return recipe.entrySet().stream().mapToInt(e -> ings.getOrDefault(e.getKey(), 0) / e.getValue()).min().orElse(0);
  }
}