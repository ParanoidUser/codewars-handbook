interface Game {
  static int combat(int health, int damage) {
    return Math.max(health - damage, 0);
  }
}