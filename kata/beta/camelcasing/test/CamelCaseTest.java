import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CamelCaseTest {
  @Test
  void testCamelBasic() {
    assertEquals("TeSt", CamelCase.cAmEl("test"));
  }

  @Test
  void testCamelEmpty() {
    assertEquals("", CamelCase.cAmEl(""));
  }

  @Test
  void testCamelAllCaps() {
    assertEquals("TeSt", CamelCase.cAmEl("TEST"));
  }

  @Test
  void testCamelStartWithCapital() {
    assertEquals("TeSt", CamelCase.cAmEl("Test"));
  }

  @Test
  void testCamelStartWithInvertedCamel() {
    assertEquals("TeSt", CamelCase.cAmEl("tEsT"));
  }

  @Test
  void testCamelOtherWord() {
    assertEquals("IdOnTeVeN", CamelCase.cAmEl("IDOntEvEN"));
  }
}