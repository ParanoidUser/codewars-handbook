import static java.util.stream.Collectors.toSet;
import static java.util.stream.Stream.of;

import java.util.Set;

class Robot {
  private final String[] answers = {"I do not understand the input", "I already know the word", "Thank you for teaching me"};
  private final Set<String> dictionary = of(answers).flatMap(s -> of(s.toLowerCase().split(" "))).collect(toSet());

  String learnWord(String word) {
    return word.matches("[a-zA-Z]+") ? (dictionary.add(word.toLowerCase()) ? answers[2] : answers[1]) + " " + word : answers[0];
  }
}