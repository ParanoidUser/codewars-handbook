import static java.util.List.of;

interface Sid {
  static String howMuchILoveYou(int nbPetals) {
    return of("not at all", "I love you", "a little", "a lot", "passionately", "madly").get(nbPetals % 6);
  }
}
