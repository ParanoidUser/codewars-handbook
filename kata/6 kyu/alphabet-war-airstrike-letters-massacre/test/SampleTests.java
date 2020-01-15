import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTests {
  @Test
  public void sampleTestCases() {
    assertEquals("Right side wins!", AlphabetWarAirstrike.alphabetWar("z"));
    assertEquals("Let's fight again!", AlphabetWarAirstrike.alphabetWar("****"));
    assertEquals("Let's fight again!", AlphabetWarAirstrike.alphabetWar("z*dq*mw*pb*s"));
    assertEquals("Let's fight again!", AlphabetWarAirstrike.alphabetWar("zdqmwpbs"));
    assertEquals("Right side wins!", AlphabetWarAirstrike.alphabetWar("zz*zzs"));
    assertEquals("Left side wins!", AlphabetWarAirstrike.alphabetWar("sz**z**zs"));
    assertEquals("Left side wins!", AlphabetWarAirstrike.alphabetWar("z*z*z*zs"));
    assertEquals("Left side wins!", AlphabetWarAirstrike.alphabetWar("*wwwwww*z*"));
    assertEquals("Let's fight again!", AlphabetWarAirstrike.alphabetWar("fbopay**szmy*mmipqyb*p*sk*kwk"));
    assertEquals("Left side wins!", AlphabetWarAirstrike.alphabetWar("pz*c*qm*kt*kl"));
  }
}
