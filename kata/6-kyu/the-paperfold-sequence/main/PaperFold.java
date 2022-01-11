import java.util.function.IntSupplier;

class PaperFold implements IntSupplier {
  int i = 0;
  public int getAsInt() {
    return (++i & Integer.lowestOneBit(i) << 1) == 0 ? 1 : 0;
  }
}
