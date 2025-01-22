import static java.util.stream.IntStream.range;

interface QueueTime {
  static int queue(int[] queuers, int pos) {
    return range(0, queuers.length).reduce(0, (m, i) -> m + Math.min(queuers[pos] - (i > pos ? 1 : 0), queuers[i]));
  }
}