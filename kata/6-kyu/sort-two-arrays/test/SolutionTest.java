import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void sample() {
    assertArrayEquals(new int[][]{
        {4, 5, 3, 2, 1},
        {9, 8, 7, 5, 6}
    }, ArraySorter.sortTwoArrays(new int[]{5, 4, 3, 2, 1}, new int[]{6, 5, 7, 8, 9}));

    assertArrayEquals(new int[][]{
        {2, 1, 3, 4, 5},
        {6, 5, 7, 8, 9}
    }, ArraySorter.sortTwoArrays(new int[]{2, 1, 3, 4, 5}, new int[]{5, 6, 7, 8, 9}));

    assertArrayEquals(new int[][]{
        {5, 5, 2, 6, 9, 6},
        {4, 3, 1, 6, 8, 7}
    }, ArraySorter.sortTwoArrays(new int[]{5, 6, 9, 2, 6, 5}, new int[]{3, 6, 7, 4, 8, 1}));

    assertArrayEquals(new int[][]{
        {131, 718, 24, 257, 710, 433, 549, 332, 212, 716, 286, 789, 639, 908, 545, 72, 480, 974,
            898, 538, 833, 691, 525, 498, 443, 691, 785, 770, 483, 356, 645, 661, 267, 366, 967,
            146, 30, 532, 931, 381, 618, 604, 406, 841, 323, 970, 211, 648, 2, 162, 509, 473, 824,
            836, 584, 522, 198, 527, 440, 208, 766, 62, 685, 835, 630, 204, 539, 196, 664, 792, 913,
            810, 595, 931, 552, 934, 59, 625, 49, 806, 18, 175, 370, 754, 858, 284, 179, 872, 544,
            708, 376, 485, 163, 283, 286, 368, 519, 968, 55, 176, 696, 365, 489, 481, 333, 286, 816,
            768, 839, 693, 612, 249, 736, 374, 194, 89},
        {449, 721, 24, 318, 711, 844, 690, 593, 169, 999, 10, 311, 451, 796, 722, 844, 738, 990,
            627, 550, 621, 577, 442, 63, 962, 30, 285, 801, 736, 803, 139, 890, 407, 46, 882, 272,
            847, 301, 803, 723, 987, 770, 352, 394, 42, 569, 240, 486, 170, 876, 266, 774, 875, 236,
            469, 804, 535, 234, 550, 327, 216, 625, 756, 152, 46, 676, 520, 662, 374, 959, 370, 700,
            601, 145, 272, 443, 281, 628, 594, 242, 230, 956, 847, 767, 36, 112, 12, 977, 729, 589,
            921, 252, 246, 143, 636, 721, 646, 902, 513, 226, 600, 513, 923, 396, 731, 751, 203,
            147, 637, 665, 349, 685, 303, 829, 421, 173}
    }, ArraySorter.sortTwoArrays(
        new int[]{198, 370, 618, 806, 509, 146, 381, 480, 286, 18, 443, 648, 549, 789, 691, 538,
            931, 552, 525, 835, 433, 131, 664, 584, 2, 481, 685, 356, 770, 49, 824, 212, 323, 913,
            406, 208, 630, 974, 498, 768, 286, 59, 810, 368, 440, 691, 175, 162, 286, 908, 194, 519,
            267, 522, 841, 257, 754, 661, 24, 872, 967, 625, 333, 55, 839, 696, 836, 970, 163, 30,
            545, 374, 366, 736, 204, 485, 792, 473, 693, 365, 716, 931, 249, 604, 284, 639, 766,
            283, 532, 785, 72, 483, 196, 898, 934, 176, 718, 595, 710, 833, 376, 332, 645, 544, 612,
            62, 539, 708, 858, 211, 179, 89, 527, 816, 968, 489},
        new int[]{550, 723, 370, 721, 469, 311, 352, 170, 803, 721, 240, 443, 46, 143, 242, 216,
            665, 676, 234, 600, 42, 10, 628, 520, 449, 876, 594, 272, 252, 711, 513, 63, 407, 637,
            394, 577, 601, 173, 236, 921, 139, 690, 646, 803, 569, 230, 722, 451, 890, 147, 990,
            804, 285, 535, 396, 30, 729, 281, 24, 751, 303, 700, 882, 844, 923, 847, 513, 421, 796,
            318, 152, 987, 301, 977, 621, 774, 636, 486, 956, 847, 112, 349, 962, 374, 736, 145,
            589, 801, 327, 246, 169, 266, 627, 203, 685, 844, 12, 662, 36, 226, 770, 46, 272, 756,
            959, 593, 625, 767, 731, 442, 738, 999, 550, 902, 829, 875}
    ));
  }
}