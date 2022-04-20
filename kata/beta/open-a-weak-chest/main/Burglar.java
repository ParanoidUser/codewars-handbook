import java.util.function.IntConsumer;

class Burglar {
  WeakChest lockpick(WeakChest chest) {
    IntConsumer pick = pin -> {
      try {
        chest.openChest(pin);
      } catch (Exception invalid) {
        // invalid code
      }
    };

    for (int pin = 0; !chest.isOpen() && pin < 1000; pin++) {
      pick.accept(pin);
    }
    return chest;
  }
}