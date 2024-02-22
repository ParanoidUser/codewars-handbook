import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;
import static java.util.stream.Stream.of;

interface Kata {
  static String sortCsvColumns(String csvFileContent) {
    String[] rows = csvFileContent.split("\n");
    String[] headers = rows[0].split(";");

    var order = range(0, headers.length).boxed().sorted(
        (a, b) -> String.CASE_INSENSITIVE_ORDER.compare(headers[a], headers[b])).toList();

    return of(rows).map(r -> order.stream().map(i -> r.split(";")[i])
        .collect(joining(";"))).collect(joining("\n"));
  }
}