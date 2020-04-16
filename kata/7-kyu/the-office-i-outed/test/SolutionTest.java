import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void basic1() {
    Person[] meet =
        new Person[] {
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
        };
    assertEquals("Get Out Now!", TheOffice.outed(meet, "laura"));
  }

  @Test
  public void basic2() {
    Person[] meet =
        new Person[] {
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
        };
    assertEquals("Nice Work Champ!", TheOffice.outed(meet, "katie"));
  }

  @Test
  public void basic3() {
    Person[] meet =
        new Person[] {
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
        };
    assertEquals("Get Out Now!", TheOffice.outed(meet, "john"));
  }

  @Test
  public void sample() {
    Person[] meet =
        new Person[] {
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
        };
    assertEquals("Nice Work Champ!", TheOffice.outed(meet, "john"));
  }
}
