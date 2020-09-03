class PythagoreanTriple {
  int pythagoreanTriple(int[] triple) {
    return triple[0] * triple[0] + triple[1] * triple[1] == triple[2] * triple[2] ? 1 : 0;
  }
}
