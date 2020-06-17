import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EnigeliisoheTest {
  @Test
  void sample() {
    assertEquals("Jiosoé iso a gearoçoni ato a caafeé ini tohee caañóni.", Main.toexuto("José is a garçon at a café in the cañón."));
    assertEquals("Toheiso iso a toesoto tooo.", Main.toexuto("This is a test too."));
    assertEquals("Toheiso iso a toesoto. Toheiso iso oniliyu a toesoto.", Main.toexuto("This is a test. This is only a test."));
    assertEquals("Caani yuou roeada toheiso afetoero ito'so toroanisoliatoeda?", Main.toexuto("Can you read this after it's translated?"));
    assertEquals("Yuou miayu liaugehe ato Baoba anida Miaroyu feoro heavuinige sotoroanigee soounidainige niamieso ini Eniigeeliiisoohee, bauto yuouro niamie poroobaabaliyu soounidaso feuniniyu tooo!", Main.toexuto("You may laugh at Bob and Mary for having strange sounding names in Enigeliisohe, but your name probably sounds funny too!"));
  }
}