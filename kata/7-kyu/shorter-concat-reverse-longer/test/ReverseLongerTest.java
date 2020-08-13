import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ReverseLongerTest {
  @Test
  void sample() {
    assertEquals("abcdetsrifabcde", ReverseLonger.shorterReverseLonger("first", "abcde"));
    assertEquals("bauollehbau", ReverseLonger.shorterReverseLonger("hello", "bau"));
    assertEquals("fghiedcbafghi", ReverseLonger.shorterReverseLonger("abcde", "fghi"));
    assertEquals("660f76f7-2297-4e38-abe3-b159ccb20187660f76f7-2297-4e38-abe3-b159ccb20187d2a7c0db2b00-3939-61a4-b1b3-9fdd76d3d2a7c0db2b00-3939-61a4-b1b3-9fdd76d3d2a7c0db2b00-3939-61a4-b1b3-9fdd76d3d2a7c0db2b00-3939-61a4-b1b3-9fdd76d3d2a7c0db2b00-3939-61a4-b1b3-9fdd76d3d2a7c0db2b00-3939-61a4-b1b3-9fdd76d3d2a7c0db2b00-3939-61a4-b1b3-9fdd76d3d2a7c0db2b00-3939-61a4-b1b3-9fdd76d3d2a7c0db2b00-3939-61a4-b1b3-9fdd76d3d2a7c0db2b00-3939-61a4-b1b3-9fdd76d3d2a7c0db2b00-3939-61a4-b1b3-9fdd76d3d2a7c0db2b00-3939-61a4-b1b3-9fdd76d3d2a7c0db2b00-3939-61a4-b1b3-9fdd76d3d2a7c0db2b00-3939-61a4-b1b3-9fdd76d3d2a7c0db2b00-3939-61a4-b1b3-9fdd76d3d2a7c0db2b00-3939-61a4-b1b3-9fdd76d3660f76f7-2297-4e38-abe3-b159ccb20187660f76f7-2297-4e38-abe3-b159ccb20187", ReverseLonger.shorterReverseLonger("660f76f7-2297-4e38-abe3-b159ccb20187660f76f7-2297-4e38-abe3-b159ccb20187", "3d67ddf9-3b1b-4a16-9393-00b2bd0c7a2d3d67ddf9-3b1b-4a16-9393-00b2bd0c7a2d3d67ddf9-3b1b-4a16-9393-00b2bd0c7a2d3d67ddf9-3b1b-4a16-9393-00b2bd0c7a2d3d67ddf9-3b1b-4a16-9393-00b2bd0c7a2d3d67ddf9-3b1b-4a16-9393-00b2bd0c7a2d3d67ddf9-3b1b-4a16-9393-00b2bd0c7a2d3d67ddf9-3b1b-4a16-9393-00b2bd0c7a2d3d67ddf9-3b1b-4a16-9393-00b2bd0c7a2d3d67ddf9-3b1b-4a16-9393-00b2bd0c7a2d3d67ddf9-3b1b-4a16-9393-00b2bd0c7a2d3d67ddf9-3b1b-4a16-9393-00b2bd0c7a2d3d67ddf9-3b1b-4a16-9393-00b2bd0c7a2d3d67ddf9-3b1b-4a16-9393-00b2bd0c7a2d3d67ddf9-3b1b-4a16-9393-00b2bd0c7a2d3d67ddf9-3b1b-4a16-9393-00b2bd0c7a2d"));
  }
}
