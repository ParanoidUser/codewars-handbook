interface Umbrella {
  static int minUmbrellas(Weather... forecast) {
    int atHome = 0;
    int atWork = 0;
    for (Weather weather : forecast) {
      int umbrella = weather == Weather.RAINY || weather == Weather.THUNDERSTORMS ? 1 : 0;
      int journey = Math.max(atWork - umbrella, 0);
      atWork = atHome + umbrella;
      atHome = journey;
    }
    return atHome + atWork;
  }
}