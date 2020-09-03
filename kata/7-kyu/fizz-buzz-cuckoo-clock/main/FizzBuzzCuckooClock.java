import java.time.LocalTime;

interface FizzBuzzCuckooClock {
  static String fizzBuzzCuckooClock(String time) {
    var clock = LocalTime.parse(time);
    if (clock.getMinute() == 0) {
      return "Cuckoo" + " Cuckoo".repeat(clock.getHour() % 12 == 0 ? 11 : clock.getHour() % 12 - 1);
    }
    return clock.getMinute() % 30 == 0 ? "Cuckoo" :
           clock.getMinute() % 15 == 0 ? "Fizz Buzz" :
           clock.getMinute() % 3 == 0 ? "Fizz" :
           clock.getMinute() % 5 == 0 ? "Buzz" : "tick";
  }
}
