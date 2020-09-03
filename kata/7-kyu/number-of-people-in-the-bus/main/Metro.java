import java.util.List;

class Metro {
  int countPassengers(List<int[]> stops) {
    return stops.stream().mapToInt(x -> x[0] - x[1]).sum();
  }
}
