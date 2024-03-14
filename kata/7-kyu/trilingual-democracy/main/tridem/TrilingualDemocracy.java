package tridem;

interface TrilingualDemocracy {
  static char trilingualDemocracy(char[] group) {
    return (char) (group[0] ^ group[1] ^ group[2]);
  }
}