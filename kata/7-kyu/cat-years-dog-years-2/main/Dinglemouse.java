interface Dinglemouse {
  static int[] ownedCatAndDog(int catYears, int dogYears) {
    return new int[] {
      catYears > 14 ? catYears > 23 ? catYears / 4 - 4 : 1 : 0,
      dogYears > 14 ? dogYears > 23 ? 2 + (dogYears - 24) / 5 : 1 : 0
    };
  }
}
