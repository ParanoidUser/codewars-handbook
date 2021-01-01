import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Stack;
import org.junit.jupiter.api.Test;

class ThrowWithoutThrowingTest {

  @Test
  void sample() {
    assertThrows(ArrayIndexOutOfBoundsException.class, ThrowWithoutThrowing::arrayIndexOutOfBound);
    assertThrows(NegativeArraySizeException.class, ThrowWithoutThrowing::negativeArraySize);
    assertThrows(NoSuchElementException.class, ThrowWithoutThrowing::noSuchElement);
    assertThrows(ArithmeticException.class, ThrowWithoutThrowing::arithmetic);
    assertThrows(ClassCastException.class, ThrowWithoutThrowing::classCast);
    assertThrows(StackOverflowError.class, ThrowWithoutThrowing::stackOverflow);
    assertThrows(NullPointerException.class, ThrowWithoutThrowing::nullPointer);
    assertThrows(NumberFormatException.class, ThrowWithoutThrowing::numberFormat);
    assertThrows(IllegalArgumentException.class, ThrowWithoutThrowing::illegalArgument);
    assertThrows(EmptyStackException.class, ThrowWithoutThrowing::emptyStack);
    assertThrows(BufferOverflowException.class, ThrowWithoutThrowing::bufferOverflow);
    assertThrows(ArrayStoreException.class, ThrowWithoutThrowing::arrayStore);
    assertThrows(UnsupportedOperationException.class, ThrowWithoutThrowing::unsupportedOperation);
    assertThrows(IllegalStateException.class, ThrowWithoutThrowing::illegalState);
  }

  @Test
  void positive() {
    var stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);

    var list = new LinkedList<>();
    list.add(1);
    list.add(2);
    list.add(3);

    var iterator = list.iterator();

    ThrowWithoutThrowing.singleElementArray.set(new Integer[]{1, 2, 3});
    ThrowWithoutThrowing.newStack.set(stack);
    ThrowWithoutThrowing.emptyList.set(list);
    ThrowWithoutThrowing.emptyIterator.set(iterator);
    ThrowWithoutThrowing.emptyBuffer.set(ByteBuffer.allocate(1));
    ThrowWithoutThrowing.recurringMethod.set(() -> {});
    ThrowWithoutThrowing.invalidNumber.set("1");
    ThrowWithoutThrowing.negativeNumber.set(0x20);

    assertDoesNotThrow(ThrowWithoutThrowing::arrayIndexOutOfBound);
    assertDoesNotThrow(ThrowWithoutThrowing::negativeArraySize);
    assertDoesNotThrow(ThrowWithoutThrowing::noSuchElement);
    assertDoesNotThrow(ThrowWithoutThrowing::arithmetic);
    assertDoesNotThrow(ThrowWithoutThrowing::classCast);
    assertDoesNotThrow(ThrowWithoutThrowing::stackOverflow);
    assertDoesNotThrow(ThrowWithoutThrowing::nullPointer);
    assertDoesNotThrow(ThrowWithoutThrowing::numberFormat);
    assertDoesNotThrow(ThrowWithoutThrowing::illegalArgument);
    assertDoesNotThrow(ThrowWithoutThrowing::emptyStack);
    assertDoesNotThrow(ThrowWithoutThrowing::bufferOverflow);
    assertDoesNotThrow(ThrowWithoutThrowing::arrayStore);
    assertDoesNotThrow(ThrowWithoutThrowing::illegalState);
    assertDoesNotThrow(ThrowWithoutThrowing::unsupportedOperation);
  }
}
