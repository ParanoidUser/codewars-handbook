interface Bali {
  static boolean bearable(int heat, double humidity) {
    return heat < 36 && humidity <= .5 && (heat < 26 || humidity < .4);
  }
}
