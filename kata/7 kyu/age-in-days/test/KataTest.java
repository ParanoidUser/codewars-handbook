import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class KataTest {
  @Test
  public void ageInDaysShouldReturnYouAre2DaysOldWhenYourBirthdayIsTwoDaysAgo() {
    LocalDate birthday = LocalDate.now().minusDays(2);
    assertEquals("You are 2 days old", Kata.ageInDays(birthday.getYear(), birthday.getMonthValue(), birthday.getDayOfMonth()));
  }

  @Test
  public void ageInDaysShouldReturnCorrectNumberOfDaysWhenYourBirthdayIsOneYearAgo() {
    LocalDate birthday = LocalDate.now().minusYears(1);
    if (LocalDate.now().isLeapYear()) {
      assertEquals("You are 366 days old", Kata.ageInDays(birthday.getYear(), birthday.getMonthValue(), birthday.getDayOfMonth()));
    } else {
      assertEquals("You are 365 days old", Kata.ageInDays(birthday.getYear(), birthday.getMonthValue(), birthday.getDayOfMonth()));
    }
  }
}
