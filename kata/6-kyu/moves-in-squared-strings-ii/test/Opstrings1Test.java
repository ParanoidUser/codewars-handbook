import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Opstrings1Test {
  @Test
  void sample() {
    assertEquals("LyfUVC\nGUFjWk\nABpfre\nJMmPrD\ntcVYqC\nooujif", Opstrings1.oper(Opstrings1::rot, "fijuoo\nCqYVct\nDrPmMJ\nerfpBA\nkWjFUG\nCVUfyL"));
    assertEquals("BClf\nhkXz\nMfoc\nvKkr", Opstrings1.oper(Opstrings1::rot, "rkKv\ncofM\nzXkh\nflCB"));
    assertEquals("xZBV....\njsbS....\nJcpN....\nfVnP....\n....PnVf\n....NpcJ\n....Sbsj\n....VBZx", Opstrings1.oper(Opstrings1::selfieAndRot, "xZBV\njsbS\nJcpN\nfVnP"));
    assertEquals("uLcq....\nJkuL....\nYirX....\nnwMB....\n....BMwn\n....XriY\n....LukJ\n....qcLu", Opstrings1.oper(Opstrings1::selfieAndRot, "uLcq\nJkuL\nYirX\nnwMB"));
  }
}
