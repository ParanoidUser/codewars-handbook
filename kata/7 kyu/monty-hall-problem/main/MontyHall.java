import static java.util.stream.IntStream.of;

class MontyHall {
  static int montyHallCase(int correctDoorNumber, int[] participantGuesses) {
    return Math.round(100f * of(participantGuesses).filter(g -> g != correctDoorNumber).count() / participantGuesses.length);
  }
}
