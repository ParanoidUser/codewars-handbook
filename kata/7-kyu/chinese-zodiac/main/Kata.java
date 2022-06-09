interface Kata {
  static String chineseZodiac(int year) {
    String[] animals = {"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"};
    String[] elements = {"Wood", "Fire", "Earth", "Metal", "Water"};
    year -= 1924;
    return elements[year / 2 % 5] + " " + animals[year % 12];
  }
}
