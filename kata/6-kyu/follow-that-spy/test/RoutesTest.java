import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RoutesTest {
  @Test
  void sample() {
    assertEquals("MNL, TAG, CEB, TAC, BOR", new Routes().findRoutes(new String[][]{
        {"MNL", "TAG"},
        {"CEB", "TAC"},
        {"TAG", "CEB"},
        {"TAC", "BOR"}
    }));
    assertEquals("Halifax, Montreal, Toronto, Chicago, Winnipeg, Seattle", new Routes().findRoutes(new String[][]{
            {"Chicago", "Winnipeg"},
            {"Halifax", "Montreal"},
            {"Montreal", "Toronto"},
            {"Toronto", "Chicago"},
            {"Winnipeg", "Seattle"}}));
  }
}