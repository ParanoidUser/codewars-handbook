import java.nio.ByteBuffer;
import java.util.*;

interface ThrowWithoutThrowing {
  ThreadLocal<Object[]> singleElementArray = ThreadLocal.withInitial(() -> new String[1]);
  ThreadLocal<Stack<?>> newStack = ThreadLocal.withInitial(Stack::new);
  ThreadLocal<List<?>> emptyList = ThreadLocal.withInitial(Collections::emptyList);
  ThreadLocal<Iterator<?>> emptyIterator = ThreadLocal.withInitial(emptyList.get()::iterator);
  ThreadLocal<ByteBuffer> emptyBuffer = ThreadLocal.withInitial(() -> ByteBuffer.allocate(0));
  ThreadLocal<Runnable> recurringMethod = ThreadLocal.withInitial(() -> ThrowWithoutThrowing::stackOverflow);
  ThreadLocal<String> invalidNumber = ThreadLocal.withInitial(() -> "");
  ThreadLocal<Integer> negativeNumber = ThreadLocal.withInitial(() -> -1);
  ThreadLocal<? super Object> outcome = new ThreadLocal<>();

  static void arrayIndexOutOfBound() {
    outcome.set(singleElementArray.get()[2]);
  }

  static void negativeArraySize() {
    outcome.set(new int[negativeNumber.get()]);
  }

  static void noSuchElement() {
    emptyIterator.get().next();
  }

  static void arithmetic() {
    outcome.set(1 / newStack.get().size());
  }

  static void classCast() {
    outcome.set(((Integer[]) (singleElementArray.get()))[0].floatValue());
  }

  static void stackOverflow() {
    recurringMethod.get().run();
  }

  static void nullPointer() {
    outcome.set(singleElementArray.get()[0].toString());
  }

  static void numberFormat() {
    outcome.set(Integer.parseInt(invalidNumber.get()));
  }

  static void illegalArgument() {
    outcome.set(Character.toChars(negativeNumber.get()));
  }

  static void emptyStack() {
    newStack.get().peek();
  }

  static void bufferOverflow() {
    emptyBuffer.get().put((byte) 1);
  }

  static void arrayStore() {
    singleElementArray.get()[0] = 0;
  }

  static void unsupportedOperation() {
    emptyList.get().remove(0);
  }

  static void illegalState() {
    emptyIterator.get().remove();
  }
}