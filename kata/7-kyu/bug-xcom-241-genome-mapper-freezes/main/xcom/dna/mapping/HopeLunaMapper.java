package xcom.dna.mapping;

import static java.util.stream.Stream.iterate;

import java.util.Objects;

class HopeLunaMapper {
  String mapStrand(SlcBase base) {
    return iterate(base, Objects::nonNull, SlcBase::next)
        .mapToInt(slc -> "_E___A__L___H_PUN____O".charAt(slc.nucleobase() & 31))
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();
  }
}