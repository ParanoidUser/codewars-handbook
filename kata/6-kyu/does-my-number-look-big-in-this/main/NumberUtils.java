import static java.util.Set.of;

interface NumberUtils {
  static boolean isNarcissistic(int n) {
    return of(1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084, 548834, 1741725,
        4210818, 9800817, 9926315, 24678050, 24678051, 88593477, 146511208, 472335975, 534494836, 912985153).contains(n);
  }
}