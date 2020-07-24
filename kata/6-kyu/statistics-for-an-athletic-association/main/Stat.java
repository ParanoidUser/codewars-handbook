import static java.util.stream.IntStream.of;
import static java.util.stream.Stream.of;

interface Stat {
  static String stat(String strg) {
    int[] times = of(strg.split(", ")).map(t -> t.split("\\|")).mapToInt(t ->
                     Integer.parseInt(t[2]) + 60 * Integer.parseInt(t[1]) + 3600 * Integer.parseInt(t[0])).sorted().toArray();

    var stats = of(times).summaryStatistics();
    int range = stats.getMax() - stats.getMin();
    int average = (int) stats.getAverage();
    int median = times.length % 2 > 0 ? times[times.length / 2] : (times[times.length / 2] + times[times.length / 2 - 1]) / 2;

    return String.format("Range: %02d|%02d|%02d Average: %02d|%02d|%02d Median: %02d|%02d|%02d",
        range / 3600, range % 3600 / 60, range % 60,
        average / 3600, average % 3600 / 60, average % 60,
        median / 3600, median % 3600 / 60, median % 60);
  }
}
