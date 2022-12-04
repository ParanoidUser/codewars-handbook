import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
   void sample() {
    assertEquals("Sml etapetx", Kata.simpleTransposition("Sample text"));
    assertEquals("Sml rnpstoipetasoiin", Kata.simpleTransposition("Simple transposition"));
    assertEquals("Alta ltesi o odl htgitr sntgl", Kata.simpleTransposition("All that glitters is not gold"));
    assertEquals("Tebte ato ao sdsrtoh etrpr fvlri icein", Kata.simpleTransposition("The better part of valor is discretion"));
    assertEquals("Cncec osmk oad fu losinede aecwrso sal", Kata.simpleTransposition("Conscience does make cowards of us all"));
    assertEquals("Iaiaini oeipratta nwegmgnto smr motn hnkolde", Kata.simpleTransposition("Imagination is more important than knowledge"));
  }
}
