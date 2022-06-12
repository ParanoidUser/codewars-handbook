class PigLatin {
  String translate(String s) {
    s = s.toLowerCase();
    return s.matches("[aeiou][a-z]*") ? s + "way" : s.matches("[a-z]*") ? s.replaceAll("^([^aeiou]*)(.*)","$2$1ay") : null;
  }
}
