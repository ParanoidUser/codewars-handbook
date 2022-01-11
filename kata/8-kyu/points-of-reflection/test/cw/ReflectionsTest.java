package cw;

import static cw.Reflections.reflectPoint;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ReflectionsTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{0, 0}, reflectPoint(new int[]{0, 0}, new int[]{0, 0}));
    assertArrayEquals(new int[]{2, 2}, reflectPoint(new int[]{0, 0}, new int[]{1, 1}));
    assertArrayEquals(new int[]{-6, -18}, reflectPoint(new int[]{2, 6}, new int[]{-2, -6}));
    assertArrayEquals(new int[]{-30, 30}, reflectPoint(new int[]{10, -10}, new int[]{-10, 10}));
    assertArrayEquals(new int[]{-25, 37}, reflectPoint(new int[]{1, -35}, new int[]{-12, 1}));
    assertArrayEquals(new int[]{-1014, -443}, reflectPoint(new int[]{1000, 15}, new int[]{-7, -214}));
  }
}
