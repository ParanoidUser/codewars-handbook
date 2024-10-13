# [Parse a linked list from a string](https://www.codewars.com/kata/parse-a-linked-list-from-a-string "https://www.codewars.com/kata/582c5382f000e535100001a7")

## Task

Create a function `parse` which accepts exactly one argument `string` / `$string` / `s` / `strrep` ( or similar, depending on the language )
which is a string representation of a linked list. Your function must return the corresponding linked list, constructed from instances of
the `Node` class/struct/type. The string representation of a list has the following format: the value of the node, followed by a whitespace,
an arrow and another whitespace (`" -> "`), followed by the rest of the linked list. Each string representation of a linked list will end in
`"null"` / `"NULL"` / `"nil"` / `"nullptr"` / `"null()"` depending on the language you are undertaking this Kata in. For example, given the
following string representation of a linked list:

```
new Node(1, new Node(2, new Node(3)))
```

Note that due to the way the constructor for `Node` is defined, if a second argument is not provided, the `next` / `$next` / `Next` field is
automatically set to `null` / `NULL` / `nil` / `nullptr` ( or equivalent in your language ). That means your function could also return the
following ( if it helps you better visualise what is actually going on ):

```
new Node(1, new Node(2, new Node(3, null)))
```

Another example: given the following string input:

```
"0 -> 1 -> 4 -> 9 -> 16 -> null"
```

... your function should return:

```
new Node(0, new Node(1, new Node(4, new Node(9, new Node(16)))))
```

If the input string is just `"null"` / `"NULL"` / `"nil"` / `"nullptr"` / `"null()"`, return `null` / `NULL` / `nil` / `nullptr` /
`null()` / `[]` ( or equivalent ).

For the simplicity of this Kata, the values of the nodes in the string representation will always ever be **non-negative integers**, so the
following would **not** occur: `"Hello World -> Goodbye World -> 123 -> null"` / `"Hello World -> Goodbye World -> 123 -> NULL"` /
`"Hello World -> Goodbye World -> 123 -> nil"` / `"Hello World -> Goodbye World -> 123 -> nullptr"` ( depending on the language ). This also
means that the values of each `Node` must also be **non-negative integers** so keep that in mind when you are parsing the list from the
string.