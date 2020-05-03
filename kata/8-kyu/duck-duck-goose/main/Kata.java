interface Kata {
  static String duckDuckGoose(Player[] players, int goose) {
    return players[--goose % players.length].name;
  }
}
