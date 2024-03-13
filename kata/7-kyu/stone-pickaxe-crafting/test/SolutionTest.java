import static java.util.Collections.nCopies;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {
  private static Stream<Arguments> testData() {
    return Stream.of(
        arguments(2, Map.of("Sticks", 4, "Cobblestone", 6)),
        arguments(0, Map.of("Sticks", 2, "Cobblestone", 1)),
        arguments(0, Map.of("Sticks", 4, "Wool", 3, "Dirt", 6)),
        arguments(4, Map.of("Wood", 4, "Cobblestone", 12)),
        arguments(1, Map.of("Sticks", 4, "Cobblestone", 3)),
        arguments(8, Map.of("Sticks", 31, "Cobblestone", 25)),
        arguments(21, Map.of("Sticks", 64, "Cobblestone", 64)),
        arguments(1, Map.of("Sticks", 2, "Cobblestone", 3, "Wool", 1, "Dirt", 1, "Diamond", 1)),
        arguments(0, Map.of("Sticks", 1, "Cobblestone", 2, "Wool", 1, "Dirt", 1, "Diamond", 1)),
        arguments(5, Map.of("Sticks", 11, "Cobblestone", 41, "Wool", 21, "Stone", 31, "Diamond", 8)),
        arguments(0, Map.of("Sticks", 1, "Wool", 1, "Dirt", 1, "Diamond", 1)),
        arguments(0, Map.of("Sticks", 1, "Cobblestone", 1, "Wood", 1, "Dirt", 1)),
        arguments(0, Map.of("Sticks", 1, "Wool", 41, "Dirt", 51, "Cobblestone", 21, "Diamond", 12)),
        arguments(30, Map.of("Wood", 51, "Cobblestone", 91)),
        arguments(24, Map.of("Wood", 12, "Cobblestone", 120)),
        arguments(16, Map.of("Wood", 33, "Cobblestone", 50)),
        arguments(0, Map.of())
    );
  }

  private static final Function<Map<String, Integer>, String[]> inventory = spec -> spec.entrySet()
      .stream()
      .flatMap(entry -> nCopies(entry.getValue(), entry.getKey()).stream())
      .toArray(String[]::new);

  @ParameterizedTest
  @MethodSource("testData")
  void runAllTests(int expected, Map<String, Integer> spec) {
    String[] materials = inventory.apply(spec);
    assertEquals(expected, Solution.stonePick(materials));
  }
}