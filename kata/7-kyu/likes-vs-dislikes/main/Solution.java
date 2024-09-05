import static java.util.stream.Stream.of;

import preloaded.Button;

interface Solution {
  static Button likeOrDislike(Button[] buttons) {
    return of(buttons).reduce(Button.Nothing, (s, b) -> s == b ? Button.Nothing : b);
  }
}