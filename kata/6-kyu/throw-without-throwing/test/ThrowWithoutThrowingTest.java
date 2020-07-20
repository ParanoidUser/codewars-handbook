import static org.junit.jupiter.api.Assertions.assertThrows;

import java.nio.BufferOverflowException;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;

class ThrowWithoutThrowingTest {
  @Test
  void sample() {
    assertThrows(ArithmeticException.class, ThrowWithoutThrowing::arithmetic);
    assertThrows(NoSuchElementException.class, ThrowWithoutThrowing::noSuchElement);
    assertThrows(ArrayIndexOutOfBoundsException.class, ThrowWithoutThrowing::arrayIndexOutOfBound);
    assertThrows(ClassCastException.class, ThrowWithoutThrowing::classCast);
    assertThrows(StackOverflowError.class, ThrowWithoutThrowing::stackOverflow);
    assertThrows(NullPointerException.class, ThrowWithoutThrowing::nullPointer);
    assertThrows(NumberFormatException.class, ThrowWithoutThrowing::numberFormat);
    assertThrows(IllegalArgumentException.class, ThrowWithoutThrowing::illegalArgument);
    assertThrows(NegativeArraySizeException.class, ThrowWithoutThrowing::negativeArraySize);
    assertThrows(EmptyStackException.class, ThrowWithoutThrowing::emptyStack);
    assertThrows(BufferOverflowException.class, ThrowWithoutThrowing::bufferOverflow);
    assertThrows(ArrayStoreException.class, ThrowWithoutThrowing::arrayStore);
    assertThrows(UnsupportedOperationException.class, ThrowWithoutThrowing::unsupportedOperation);
    assertThrows(IllegalStateException.class, ThrowWithoutThrowing::illegalState);
  }
}
