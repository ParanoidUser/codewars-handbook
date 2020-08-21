interface DnaStrand {
  static String makeComplement(String dna) {
    return dna.replace('T', '_').replace('A', 'T').replace('_', 'A')
              .replace('C', '_').replace('G', 'C').replace('_', 'G');
  }
}
