import java.util.concurrent.atomic.AtomicInteger;

interface A {
  AtomicInteger POWER = new AtomicInteger();

  static int getNumber() {
    return 1 << POWER.getAndIncrement();
  }
}