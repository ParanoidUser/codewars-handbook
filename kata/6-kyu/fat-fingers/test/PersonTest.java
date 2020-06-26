import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class PersonTest {
  @Test
  void sample() {
    assertEquals("The end of the institution, mINTENnce, ND dministrTION OF GOVERNMENT, IS TO SECURE THE EXISTENCE OF THE BODY POLITIC, TO PROTECT IT, nd to furnish the individuLS WHO COMPOSE IT WITH THE POWER OF ENJOYING IN Sfety ND TRnquillity their nTURl rights, ND THE BLESSINGS OF LIFE: nd whenever these greT OBJECTS re not obtINED, THE PEOPLE Hve  RIGHT TO lter the government, ND TO Tke meSURES NECESSry for their sFETY, PROSPERITY nd hPPINESS.", Kata.fatFingers("The end of the institution, maintenance, and administration of government, is to secure the existence of the body politic, to protect it, and to furnish the individuals who compose it with the power of enjoying in safety and tranquillity their natural rights, and the blessings of life: and whenever these great objects are not obtained, the people have a right to alter the government, and to take measures necessary for their safety, prosperity and happiness."));
    assertEquals("The quick brown fox jumps over the lZY DOG.", Kata.fatFingers("The quick brown fox jumps over the lazy dog."));
    assertEquals("BBbbB", Kata.fatFingers("abABaBabAb"));
    assertEquals("", Kata.fatFingers("aAaaaaAaaaAAaAa"));
    assertNull(Kata.fatFingers(null));
  }
}