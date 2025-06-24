# [Adapter to java.util.List.of](https://www.codewars.com/kata/adapter-to-java-dot-util-dot-list-dot-of "https://www.codewars.com/kata/65e5ef770a978e003e36f16a")

If you are a experimented java programer you should has use intensive the List.of functionality. It provides an array and use it like a List one.

Newbies get frustration because the returned List cannot be usead as usual.

In particular, the returned List has some limitation, like be a inmutable List.

The fact that a structure is an inmutable one is that you cannot alter it adding, removing o change the elements in.

The key of this anomalous behavior is that the structure actualy is an array, only the perspective of the new object is a List, but all methods barely translates into array operations.

This dessign pattern is ussualy named Adapter.

Your task is make a method than receives an array (or a varargs) and return a structure that asumes the List interface but internaly remains keeping an array. Like the method List.of works.

Obviusly, you cannot use the next triks in your code:
* List.of
* .of
* the operator new other than Exceptions

Your structure must implements al methods from the List interface.

You can learn more of the List.of method [here](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html#of())
