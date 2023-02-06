import java.util.Date;

class Day {
  String countDays(Date d) {
    long days = (d.getTime() - System.currentTimeMillis()) / 86399900;
    return days < 0 ? "The day is in the past!" : days > 0 ? days + " days" : "Today is the day!";
  }
}
