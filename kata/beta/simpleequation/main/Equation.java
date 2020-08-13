class Equation {
  int solve(String equation) {
    var sides = equation.split("=");
    return Integer.parseInt(sides[0]) / Integer.parseInt(sides[1]);
  }
}