import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleTestCases {
  @Test
  public void someBasicTimesTests() {
    assertEquals("tick", FizzBuzzCuckooClock.fizzBuzzCuckooClock("13:34"));
    assertEquals("Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo", FizzBuzzCuckooClock.fizzBuzzCuckooClock("21:00"));
    assertEquals("Fizz Buzz", FizzBuzzCuckooClock.fizzBuzzCuckooClock("11:15"));
    assertEquals("Fizz", FizzBuzzCuckooClock.fizzBuzzCuckooClock("03:03"));
    assertEquals("Cuckoo", FizzBuzzCuckooClock.fizzBuzzCuckooClock("14:30"));
    assertEquals("Buzz", FizzBuzzCuckooClock.fizzBuzzCuckooClock("08:55"));
    assertEquals("Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo", FizzBuzzCuckooClock.fizzBuzzCuckooClock("00:00"));
    assertEquals("Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo", FizzBuzzCuckooClock.fizzBuzzCuckooClock("12:00"));
  }
}
