import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

interface ThrowWithoutThrowing {
  static void arrayIndexOutOfBound() {
    System.out.println((new int[0])[1]);
  }

  static void negativeArraySize() {
    System.out.println(new int[-1]);
  }

  static void noSuchElement() {
    System.out.println(List.of().iterator().next());
  }

  static void arithmetic() {
    System.out.println(0 / 0);
  }

  static void classCast() {
    System.out.println((int) new Object());
  }

  static void stackOverflow() {
    stackOverflow();
  }

  static void nullPointer() {
    System.out.println(((Object) null).toString());
  }

  static void numberFormat() {
    System.out.println(Integer.parseInt(""));
  }

  static void illegalArgument() {
    System.out.println(Character.toChars(-1));
  }

  static void emptyStack() {
    System.out.println(new Stack<>().peek());
  }

  static void bufferOverflow() {
    System.out.println(ByteBuffer.allocate(0).put((byte) 1));
  }

  static void arrayStore() {
    System.out.println(((Object[]) new String[1])[0] = 0);
  }

  static void unsupportedOperation() {
    System.out.println(List.of().remove(0));
  }

  static void illegalState() {
    Collections.emptyIterator().remove();
  }
}
