import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class VowelMapperTest {
  private static Stream<Arguments> testData() {
    return Stream.of(
        Arguments.of(
            List.of(118, 117, 120, 121, 117, 98, 122, 97, 120, 106, 104, 116, 113, 114, 113, 120, 106),
            List.of(118, "u", 120, 121, "u", 98, 122, "a", 120, 106, 104, 116, 113, 114, 113, 120, 106)
        ),
        Arguments.of(
            List.of(101, 121, 110, 113, 113, 103, 121, 121, 101, 107, 103),
            List.of("e", 121, 110, 113, 113, 103, 121, 121, "e", 107, 103)
        )
    );
  }

  @ParameterizedTest
  @MethodSource("testData")
  void sample(List<Integer> input, List<Object> expected) {
    assertEquals(expected, VowelMapper.isVow(input));
  }
}