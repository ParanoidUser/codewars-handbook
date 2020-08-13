class AgeDiff {
  String CalculateAge(int birth, int year) {
    return (year -= birth) == 0 ? "You were born this very year!" : year > 0
            ? String.format("You are %d year%s old.", year, year == 1 ? "" : "s")
            : String.format("You will be born in %d year%s.", -year, -year == 1 ? "" : "s");
  }
}
