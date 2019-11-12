import java.util.List;

class Sid {
  static String howMuchILoveYou(int nb_petals) {
    return List.of("not at all", "I love you", "a little", "a lot", "passionately", "madly").get(nb_petals % 6);
  }
}
