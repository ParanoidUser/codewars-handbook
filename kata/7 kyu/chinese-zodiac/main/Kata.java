class Kata extends Arrays {
    static String chineseZodiac(int year) {
        return elements[(year -=1924) / 2 % 5] + " " + animals[year % 12];
    }
}
