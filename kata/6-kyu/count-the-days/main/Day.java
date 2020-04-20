import java.util.Date;

public class Day {
  static String countDays(Date d) {
    long days = (d.getTime() - System.currentTimeMillis()) / 86400000;
    return days < 0 ? "The day is in the past!" : days > 0 ? days + " days" : "Today is the day!";
  }
}