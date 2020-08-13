import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTests {
  @Test
  void sample() {
    assertEquals("Bb,Bb,Ccc,Ccc,Dddd,Eeeee,Hhhhhhhh,Iiiiiiiii,Nnnnnnnnnnnnnn,Vvvvvvvvvvvvvvvvvvvvvv,Xxxxxxxxxxxxxxxxxxxxxxxx", Solution.alphaSeq("HbideVbxncC"));
    assertEquals("Dddd,Eeeee,Iiiiiiiii,Jjjjjjjjjj,Kkkkkkkkkkk,Mmmmmmmmmmmmm,Mmmmmmmmmmmmm,Nnnnnnnnnnnnnn,Ooooooooooooooo,Uuuuuuuuuuuuuuuuuuuuu,Vvvvvvvvvvvvvvvvvvvvvv", Solution.alphaSeq("EvidjUnokmM"));
    assertEquals("Bb,Eeeee,Ffffff,Ffffff,Ggggggg,Llllllllllll,Nnnnnnnnnnnnnn,Sssssssssssssssssss,Yyyyyyyyyyyyyyyyyyyyyyyyy,Yyyyyyyyyyyyyyyyyyyyyyyyy,Yyyyyyyyyyyyyyyyyyyyyyyyy", Solution.alphaSeq("NyffsGeyylB"));
    assertEquals("Bb,Jjjjjjjjjj,Kkkkkkkkkkk,Mmmmmmmmmmmmm,Ooooooooooooooo,Qqqqqqqqqqqqqqqqq,Rrrrrrrrrrrrrrrrrr,Tttttttttttttttttttt,Uuuuuuuuuuuuuuuuuuuuu,Uuuuuuuuuuuuuuuuuuuuu,Vvvvvvvvvvvvvvvvvvvvvv", Solution.alphaSeq("MjtkuBovqrU"));
    assertEquals("Eeeee,Ggggggg,Llllllllllll,Nnnnnnnnnnnnnn,Nnnnnnnnnnnnnn,Pppppppppppppppp,Qqqqqqqqqqqqqqqqq,Rrrrrrrrrrrrrrrrrr,Uuuuuuuuuuuuuuuuuuuuu,Xxxxxxxxxxxxxxxxxxxxxxxx,Zzzzzzzzzzzzzzzzzzzzzzzzzz", Solution.alphaSeq("ZpglnRxqenU"));
  }
}
