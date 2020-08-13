interface Kata {
  static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
    int health1 = (int) Math.ceil((double) fighter2.health / fighter1.damagePerAttack);
    int health2 = (int) Math.ceil((double) fighter1.health / fighter2.damagePerAttack);
    return health1 < health2 ? fighter1.name : health1 > health2 ? fighter2.name : firstAttacker;
  }
}
