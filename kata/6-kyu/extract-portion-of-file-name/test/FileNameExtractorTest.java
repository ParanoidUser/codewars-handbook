import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FileNameExtractorTest {
  @Test
  void sample() {
    assertEquals("FILE_NAME.EXTENSION", FileNameExtractor.extractFileName("1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION"));
    assertEquals("FILE_NAME.EXTENSION", FileNameExtractor.extractFileName("1_FILE_NAME.EXTENSION.OTHEREXTENSIONadasdassdassds34"));
  }
}