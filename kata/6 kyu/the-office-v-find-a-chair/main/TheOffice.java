import static java.util.Arrays.copyOf;

class TheOffice {
  static Object meeting(Room[] x, int need) {
    int[] chairs = new int[0];
    for (int i = 0; need > 0 && i < x.length; i++) {
      int free = Math.max(0, x[i].chairs - x[i].occupants.length());
      (chairs = copyOf(chairs, chairs.length + 1))[i] = (need -= free) < 0 ? free + need : free;
    }
    return need > 0 ? "Not enough!" : chairs.length > 0 ? chairs : "Game On";
  }
}
