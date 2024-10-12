# [[BUG] XCOM-241: Genome mapper freezes](https://www.codewars.com/kata/bug-xcom-241-genome-mapper-freezes "https://www.codewars.com/kata/64d55f26529cad3a7a8c6752")

## [XCOM-241] Genome mapper freezes on long DNA strands

**Type:** Bug 🪳
**Priority:** Critical 🔥
**Component:** Genome mapper
**Reporter:** `ikleiner`
**Assignee:** _Assigned to you_

### Description of the bug

The genome mapper created by software engineers from Black Mesa Research Facility freezes and produces no output when mapping long strands
of alien DNA sampled from recently obtained body of sectoid psionic.

However, the mapper does not hang for short samples simulating more primitive alien life forms like silacoids, celatids, and mutons.

Only after the performance issue gets fixed, the research team will be able to move to the second stage of tests and verify correctness of
performed mapping.

### Additional info

**Strand format:** SLC (singly-linked chain of alien DNA nucleobases). Nucleobases are represented as following records:

```java
public record SlcBase(SlcBase next, char nucleobase) {

}
```

**Mapping:** `HOPE-LUNA` mapping (`H` maps to `L`, `O` to `U`, `P` to `N`, `E` to `A`, and vice versa). Lowercase inputs map to uppercase
output.
**Throughput:** It's necessary to be able to process hundreds of strands of ~200k nucleobases.

### Notes

This bug is CRITICAL and must be fixed ASAP! The body of the sectoid psionic is going to decompose in three days, and it will be impossible
to use it for further research!