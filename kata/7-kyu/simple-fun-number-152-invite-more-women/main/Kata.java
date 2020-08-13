import static java.util.stream.IntStream.of;

interface Kata {
  static boolean inviteMoreWomen(int[] l) {
    return of(l).sum() > 0;
  }
}
