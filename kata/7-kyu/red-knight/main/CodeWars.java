interface CodeWars {
  static PawnDistance redKnight(int knight, long pawn) {
    return new PawnDistance((pawn - knight) % 2 > 0 ? "Black" : "White", 2 * pawn);
  }
}