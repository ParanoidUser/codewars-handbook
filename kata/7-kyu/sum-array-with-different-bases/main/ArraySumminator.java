import static java.util.stream.Stream.of;

interface ArraySumminator {
  static long sumItUp(BasedNumbers[] numbersWithBases) {
    return of(numbersWithBases).mapToLong(n -> Long.parseLong(n.number, n.base)).sum();
  }
}
