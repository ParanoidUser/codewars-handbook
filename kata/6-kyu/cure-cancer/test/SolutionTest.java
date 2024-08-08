import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[0], JomoPipi.mutationLocation(new char[][]{
        "WellAndHealthy".toCharArray(),
        "WellAndHealthy".toCharArray(),
        "WellAndHealthy".toCharArray(),
        "WellAndHealthy".toCharArray()
    }));

    assertArrayEquals(new int[]{1, 4}, JomoPipi.mutationLocation(new char[][]{
        "thisIsAsmallerPerson".toCharArray(),
        "thisssAsmallerPerson".toCharArray(),
        "thisIsAsmallerPerson".toCharArray(),
        "thisIsAsmallerPerson".toCharArray()
    }));

    assertArrayEquals(new int[]{3, 4}, JomoPipi.mutationLocation(new char[][]{
        "thisIsAsmallerPerson".toCharArray(),
        "thisIsAsmallerPerson".toCharArray(),
        "thisIsAsmallerPerson".toCharArray(),
        "thisssAsmallerPerson".toCharArray()
    }));

    assertArrayEquals(new int[]{9, 14}, JomoPipi.mutationLocation(new char[][]{
        "someGreaTstuffIthinkThisIs".toCharArray(),
        "someGreaTstuffIthinkThisIs".toCharArray(),
        "someGreaTstuffIthinkThisIs".toCharArray(),
        "someGreaTstuffIthinkThisIs".toCharArray(),
        "someGreaTstuffIthinkThisIs".toCharArray(),
        "someGreaTstuffIthinkThisIs".toCharArray(),
        "someGreaTstuffIthinkThisIs".toCharArray(),
        "someGreaTstuffIthinkThisIs".toCharArray(),
        "someGreaTstuffIthinkThisIs".toCharArray(),
        "someGreaTstuff1thinkThisIs".toCharArray(),
        "someGreaTstuffIthinkThisIs".toCharArray(),
        "someGreaTstuffIthinkThisIs".toCharArray(),
        "someGreaTstuffIthinkThisIs".toCharArray(),
        "someGreaTstuffIthinkThisIs".toCharArray(),
        "someGreaTstuffIthinkThisIs".toCharArray(),
        "someGreaTstuffIthinkThisIs".toCharArray()
    }));
  }
}