import static preload.Preload.oneTwo;

interface Main {
  static int oneTwoThree() {
    return oneTwo() > 1 ? oneTwo() : oneTwo() > 1 ? 3 : oneTwoThree();
  }
}
