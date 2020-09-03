import static java.util.stream.IntStream.range;

class Rotator {
  Object[] rotate(Object[] data, int n) {
    return range(0, data.length).mapToObj(i -> data[Math.floorMod(i - n , data.length)]).toArray();
  }
}
