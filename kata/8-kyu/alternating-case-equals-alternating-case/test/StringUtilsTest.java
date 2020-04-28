import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringUtilsTest {
  @Test
  void fixedTests() {
    assertEquals("HELLO WORLD", StringUtils.toAlternativeString("hello world"));
    assertEquals("hello world", StringUtils.toAlternativeString("HELLO WORLD"));
    assertEquals("HELLO world", StringUtils.toAlternativeString("hello WORLD"));
    assertEquals("hEllO wOrld", StringUtils.toAlternativeString("HeLLo WoRLD"));
    assertEquals("Hello World", StringUtils.toAlternativeString(StringUtils.toAlternativeString("Hello World")));
    assertEquals("12345", StringUtils.toAlternativeString("12345"));
    assertEquals("1A2B3C4D5E", StringUtils.toAlternativeString("1a2b3c4d5e"));
    assertEquals("sTRINGuTILS.TOaLTERNATINGcASE", StringUtils.toAlternativeString("StringUtils.toAlternatingCase"));
  }

  @Test
  void kataTitleTests() {
    assertEquals("ALTerNAtiNG CaSe", StringUtils.toAlternativeString("altERnaTIng cAsE"));
    assertEquals("altERnaTIng cAsE", StringUtils.toAlternativeString("ALTerNAtiNG CaSe"));
    assertEquals("ALTerNAtiNG CaSe <=> altERnaTIng cAsE", StringUtils.toAlternativeString("altERnaTIng cAsE <=> ALTerNAtiNG CaSe"));
    assertEquals("altERnaTIng cAsE <=> ALTerNAtiNG CaSe", StringUtils.toAlternativeString("ALTerNAtiNG CaSe <=> altERnaTIng cAsE"));
  }
}