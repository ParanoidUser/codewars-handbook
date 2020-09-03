import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("Get Out Now!", TheOffice.outed(new Person[] {
        new Person("tim", 0),
        new Person("jim", 2),
        new Person("randy", 0),
        new Person("sandy", 7),
        new Person("andy", 0),
        new Person("katie", 5),
        new Person("laura", 1),
        new Person("saajid", 2),
        new Person("alex", 3),
        new Person("john", 2),
        new Person("mr", 0)
    }, "laura"));

    assertEquals("Nice Work Champ!", TheOffice.outed(new Person[] {
        new Person("tim", 1),
        new Person("jim", 3),
        new Person("randy", 9),
        new Person("sandy", 6),
        new Person("andy", 7),
        new Person("katie", 6),
        new Person("laura", 9),
        new Person("saajid", 9),
        new Person("alex", 9),
        new Person("john", 9),
        new Person("mr", 8)
    }, "katie"));

    assertEquals("Get Out Now!", TheOffice.outed(new Person[] {
        new Person("tim", 2),
        new Person("jim", 4),
        new Person("randy", 0),
        new Person("sandy", 5),
        new Person("andy", 8),
        new Person("katie", 6),
        new Person("laura", 2),
        new Person("saajid", 2),
        new Person("alex", 3),
        new Person("john", 2),
        new Person("mr", 8),
    }, "john"));

    assertEquals("Nice Work Champ!", TheOffice.outed(new Person[] {
        new Person("tim", 6),
        new Person("jim", 4),
        new Person("randy", 0),
        new Person("sandy", 4),
        new Person("andy", 8),
        new Person("katie", 3),
        new Person("laura", 5),
        new Person("saajid", 5),
        new Person("alex", 7),
        new Person("john", 6),
        new Person("mr", 7),
    }, "john"));
  }
}
