interface Kata {
    static String chineseZodiac(int year) {
        var animals = new String[]{"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"};
        var elements = new String[]{"Wood", "Fire", "Earth", "Metal", "Water"};
        return elements[(year -=1924) / 2 % 5] + " " + animals[year % 12];
    }
}
