import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HistTest {
  @Test
  void sample() {
    assertEquals("u  2     **\rw  1     *\rz  1     *", Hist.hist("aaifzlnderpeurcuqjqeywdq"));
    assertEquals("u  1     *\rw  4     ****\rx  2     **\rz  1     *", Hist.hist("bnxyytdtqrkeaswymiwbxnuydwthweyzny"));
    assertEquals("u  4     ****\rw  3     ***\rx  4     ****\rz  4     ****", Hist.hist("sjeneccyhrcpfvpujfaoaykqllteovskclebmzjeqepilxygdmzvdfmxbqdzubkzturnuqxsewrwgmdfwgdx"));
    assertEquals("u  5     *****\rw  4     ****\rx  4     ****\rz  4     ****", Hist.hist("ttopvdaxgwfpzjmomkwssytktaizqtsekfmfhrabidwaugioqyyzrxbugsusxkfdevmijqyprcoxfyjqwsutoutjgozyhsoytg"));
    assertEquals("u  3     ***\rw  4     ****\rx  6     ******\rz  6     ******", Hist.hist("tpwaemuqxdmwqbqrjbeosjnejqorxdozsxnrgpgqkeihqwybzyymqeazfkyiucesxwutgszbenzvgxibxrlvmzihcb"));
  }
}
