# [Adapter to java.util.List.of](https://www.codewars.com/kata/adapter-to-java-dot-util-dot-list-dot-of "https://www.codewars.com/kata/65e5ef770a978e003e36f16a")

If you're an experienced Java programmer, you've likely come across `List.of`, but it often frustrates newcomers since the returned list is
immutable and doesn’t allow adding, removing, or modifying elements. This happens because the object implements the `java.util.List`
interface but delegates its method calls to another implementation behind the scenes, demonstrating the Adapter pattern that allows
different interfaces
to work together by translating method calls.

Your task is to create a method that takes an array (or varargs) and returns a `List` structure that keeps the data immutable, similar to
how `List.of` works.

You cannot use:
 - List.of
 - any method named .of
 - the new operator, except when creating Exceptions

You can find more info on [List.of()](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html#of()) in the Java docs.