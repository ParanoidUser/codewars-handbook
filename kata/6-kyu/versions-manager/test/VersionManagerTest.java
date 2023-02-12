import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class VersionManagerTest {
  @CsvSource(textBlock = """
          0.0.1,   ''
          1.2.3,   1.2.3
          1.2.3,   1.2.3.4
          1.2.3,   1.2.3.d
          1.0.0,   1
          1.1.0,   1.1
      """)
  @ParameterizedTest
  void initializationTests(String expected, String version) {
    assertEquals(expected, new VersionManager(version).release());
  }

  @Test
  void initializationTests_defaultConstructor() {
    assertEquals("0.0.1", new VersionManager().release());
  }

  @Test
  void majorReleasesTests() {
    assertEquals("1.0.0", new VersionManager().major().release());
    assertEquals("2.0.0", new VersionManager("1.2.3").major().release());
    assertEquals("3.0.0", new VersionManager("1.2.3").major().major().release());
  }

  @Test
  void minorReleasesTests() {
    assertEquals("0.1.0", new VersionManager().minor().release());
    assertEquals("1.3.0", new VersionManager("1.2.3").minor().release());
    assertEquals("1.1.0", new VersionManager("1").minor().release());
    assertEquals("4.2.0", new VersionManager("4").minor().minor().release());
  }

  @Test
  void patchReleasesTests() {
    assertEquals("0.0.2", new VersionManager().patch().release());
    assertEquals("1.2.4", new VersionManager("1.2.3").patch().release());
    assertEquals("4.0.2", new VersionManager("4").patch().patch().release());
  }

  @Test
  void rollbacksTests() {
    assertEquals("0.0.1", new VersionManager().major().rollback().release());
    assertEquals("0.0.1", new VersionManager().minor().rollback().release());
    assertEquals("0.0.1", new VersionManager().patch().rollback().release());
    assertEquals("1.0.0", new VersionManager().major().patch().rollback().release());
    assertEquals("1.0.0", new VersionManager().major().patch().rollback().major().rollback().release());
    assertEquals("0.0.1", new VersionManager().major().patch().rollback().rollback().release());
  }

  @Test
  void seperatedCallsTests() {
    VersionManager m = new VersionManager("1.2.3");
    m.major();
    m.minor();
    assertEquals("2.1.0", m.release());
  }

  @ValueSource(strings = {"a", "a.b.c", "1.a", "0.1.a.5"})
  @ParameterizedTest
  void invalidInitialVersion(String version) {
    var error = assertThrows(Exception.class, () -> new VersionManager(version));
    assertEquals("Error occured while parsing version!", error.getMessage());
  }

  @Test
  void invalidRollbacks() {
    VersionManager m = new VersionManager();
    var error = assertThrows(Exception.class, m::rollback);
    assertEquals("Cannot rollback!", error.getMessage());
    assertDoesNotThrow(m::major, "VersionManager should still be usable after failed rollback");
    assertDoesNotThrow(m::rollback, "VersionManager can rollback once");
    assertThrows(Exception.class, m::rollback, "Cannot rollback twice after one release");
  }
}