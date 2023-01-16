import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BankAccountTest {
  @Test
  void sample() {
    assertEquals(123456789, BankAccount.parse(
        """
                _  _     _  _  _  _  _\s
              | _| _||_||_ |_   ||_||_|
              ||_  _|  | _||_|  ||_| _|
            """));
    assertEquals(23056789, BankAccount.parse(
        """
             _  _  _  _  _  _  _  _  _\s
            | | _| _|| ||_ |_   ||_||_|
            |_||_  _||_| _||_|  ||_| _|
            """
    ));
    assertEquals(823856989, BankAccount.parse(
        """
             _  _  _  _  _  _  _  _  _\s
            |_| _| _||_||_ |_ |_||_||_|
            |_||_  _||_| _||_| _||_| _|
            """
    ));
  }
}