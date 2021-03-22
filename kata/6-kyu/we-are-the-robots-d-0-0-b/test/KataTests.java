import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class KataTests {
  @Test
  void sample() {
    assertArrayEquals(new String[]{"0 robots functioning automatik", "0 robots dancing mechanik"},
        Kata.countRobots(new String[0]));

    assertArrayEquals(new String[]{"0 robots functioning automatik", "0 robots dancing mechanik"},
        Kata.countRobots(new String[]{"We're functioning automatik", "And we are dancing mechanik"}));

    assertArrayEquals(new String[]{"1 robots functioning automatik", "2 robots dancing mechanik"},
        Kata.countRobots(new String[]{"We're functioning automatik d[(0)(0)]b", "And we are dancing mechanik d[(0)(0)]b d[(0)(0)]b"}));

    assertArrayEquals(new String[]{"2 robots functioning automatik", "3 robots dancing mechanik"},
        Kata.countRobots(new String[]{"d[(0)(0)]b We're functioning automatik d[(0)(0)]b", "And we are d[(0)(0)]b dancing mechanik d[(0)(0)]b d[(0)(0)]b"}));

    assertArrayEquals(new String[]{"2 robots functioning automatik", "3 robots dancing mechanik"},
        Kata.countRobots(new String[]{"d[(0)(0)}b We're functioning automatik D[(0)(0)]b", "And we are d[(0)(0}]b dancing mechanik d[(0)(0)]b c[(0)(0)]b"}));

    assertArrayEquals(new String[]{"3 robots functioning automatik", "3 robots dancing mechanik"},
        Kata.countRobots(new String[]{"d*(0)(0)}b We're functioning e(<0/>0]#m Automatik Roboter0%1 D[(0)(0)]b", "And we are d[(0)(0}]b dancing mechanik d[(0)(0)]b c[(0)(0)]b"}));

    assertArrayEquals(new String[]{"3 robots functioning automatik", "0 robots dancing mechanik"},
        Kata.countRobots(new String[]{"d*(0)(0)}b We're functioning d>[0;;0&&f automatik D[(0)(0)]b", "and m><0(;0[;a we dancing are Mechanic"}));

    assertArrayEquals(new String[]{"2 robots functioning automatik", "3 robots dancing mechanik"},
        Kata.countRobots(new String[]{"We're charging our battery", "And now we're full of energy", "We are the robots", "We're functioning automatik", "And we are dancing mechanik", "We are the robotororo robots", "Ja tvoi sluga", "Ja tvoi Rabotnik robotnik", "We are programmed just to do", "anything you want us to", "we are the robots", "We're functioning Automatic", "and we are dancing Mechanic", "we are the robots", "Ja tvoi sluga", "Ja tvoi Rabotnik robotnik", "We are the robots", "d*(0)(0)}b We're functioning automatik D[(0)(0)]b", "And we are d[(0)(0}]b dancing mechanik Roboter0%1 d[(0)(0)]b c[(0)(0)]b"}));

    assertArrayEquals(new String[]{"0 robots functioning automatik", "0 robots dancing mechanik"},
        Kata.countRobots(new String[]{"d (0)(0)}b We're functioning &>[0;;0&&f automatik D[(0 (0)]b", "and m><0(;0 ;a we dancing are Mechanic"}));
  }
}