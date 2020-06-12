import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("This_Is_A_Unit_Test", CamelCaseTranslator.toUnderScore("ThisIsAUnitTest"));
    assertEquals("This_Should_Be_Split_Correct_Into_Underscore", CamelCaseTranslator.toUnderScore("ThisShouldBeSplitCorrectIntoUnderscore"));
    assertEquals("Calculating_1_Plus_1_Equals_2", CamelCaseTranslator.toUnderScore("Calculating1Plus1Equals2"));
    assertEquals("Calculating_5_Plus_5_Equals_10", CamelCaseTranslator.toUnderScore("Calculating5Plus5Equals10"));
    assertEquals("Calculate_500_Divided_By_5_Equals_100", CamelCaseTranslator.toUnderScore("Calculate500DividedBy5Equals100"));
    assertEquals("This_Is_Already_Split_Correct", CamelCaseTranslator.toUnderScore("This_Is_Already_Split_Correct"));
    assertEquals("This_Is_Not_Split_Correct", CamelCaseTranslator.toUnderScore("ThisIs_Not_SplitCorrect"));
    assertEquals("Adding_3_To_3_Should_Be_6", CamelCaseTranslator.toUnderScore("Adding_3To_3ShouldBe_6"));
    assertEquals("_If_A_Test_Start_And_Ends_With_Underscore_It_Should_Be_The_Same_", CamelCaseTranslator.toUnderScore("_IfATestStartAndEndsWithUnderscore_ItShouldBeTheSame_"));
  }
}
