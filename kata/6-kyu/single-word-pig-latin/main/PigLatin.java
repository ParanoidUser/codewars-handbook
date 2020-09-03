class PigLatin {
  String translate(String s) {
    return (s = s.toLowerCase()).matches("[aeiou][a-z]*") ? s + "way" : s.matches("[a-z]*") ? s.replaceAll("^([^aeiou]*)(.*)","$2$1ay") : null;
  }
}
