import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BankAccountTest {
  @Test
  void sample() {
    assertEquals(123456789, BankAccount.parse(
        "    _  _     _  _  _  _  _ \n" +
            "  | _| _||_||_ |_   ||_||_|\n" +
            "  ||_  _|  | _||_|  ||_| _|\n"));
    assertEquals(23056789, BankAccount.parse(
        " _  _  _  _  _  _  _  _  _ \n" +
            "| | _| _|| ||_ |_   ||_||_|\n" +
            "|_||_  _||_| _||_|  ||_| _|\n"
    ));
    assertEquals(823856989, BankAccount.parse(
        " _  _  _  _  _  _  _  _  _ \n" +
            "|_| _| _||_||_ |_ |_||_||_|\n" +
            "|_||_  _||_| _||_| _||_| _|\n"
    ));
  }
}