import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SignalTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{3}, SignalProcessor.process(new double[]{.94, 1.02, 5.01, .99, 5.12, 4.89}));
    assertArrayEquals(new int[]{14, 8, 5}, SignalProcessor.process(new double[]{.91, 4.86, .83, .91, 4.86, 4.86, 4.89, 1.13, 5.14, .86, 1., 1.1, .86, 5.07, 1.06, 4.85}));
    assertArrayEquals(new int[]{1, 0, 1, 0, 0, 1, 1, 0, 1}, SignalProcessor.process(new double[]{.82, .9, .8, 5., 5.13, 1.12, 5.16, .97, .84, 5.12, 5.09, 1.05, 5.06}));
  }
}