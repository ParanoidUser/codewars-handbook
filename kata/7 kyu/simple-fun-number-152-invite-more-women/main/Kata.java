import static java.util.stream.IntStream.of;

class Kata {
  static boolean inviteMoreWomen(int[] l) {
    return of(l).sum() > 0;
  }
}
