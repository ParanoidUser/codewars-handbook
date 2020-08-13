import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

interface ThrowWithoutThrowing {
  static void arrayIndexOutOfBound() {
    Integer.valueOf((new int[0])[1]);
  }

  static void negativeArraySize() {
    List.of(new int[-1]);
  }

  static void noSuchElement() {
    List.of().iterator().next();
  }

  static void arithmetic() {
    Integer.valueOf(1 / 0);
  }

  static void classCast() {
    ((String) new Object()).getClass();
  }

  static void stackOverflow() {
    stackOverflow();
  }

  static void nullPointer() {
    ((Object) null).toString();
  }

  static void numberFormat() {
    Integer.parseInt("");
  }

  static void illegalArgument() {
    Character.toChars(-1);
  }

  static void emptyStack() {
    new Stack<>().peek();
  }

  static void bufferOverflow() {
    ByteBuffer.allocate(0).put((byte) 1);
  }

  static void arrayStore() {
    ((Object[]) new String[1])[0] = 0;
  }

  static void unsupportedOperation() {
    List.of().remove(0);
  }

  static void illegalState() {
    Collections.emptyIterator().remove();
  }
}
