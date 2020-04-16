# [Catalog](https://www.codewars.com/kata/catalog "https://www.codewars.com/kata/59d9d8cb27ee005972000045")

You are given a small extract of a catalog:

```
s = "<prod><name>drill</name><prx>99</prx><qty>5</qty></prod>

<prod><name>hammer</name><prx>10</prx><qty>50</qty></prod>

<prod><name>screwdriver</name><prx>5</prx><qty>51</qty></prod>

<prod><name>table saw</name><prx>1099.99</prx><qty>5</qty></prod>

<prod><name>saw</name><prx>9</prx><qty>10</qty></prod>

...
```

(`prx` stands for `price`, `qty` for `quantity`) and an article i.e "saw".

The `function catalog(s, "saw")` returns the line(s) corresponding to the article
with `$` before the prices:

```
"table saw > prx: $1099.99 qty: 5\nsaw > prx: $9 qty: 10\n..."
```

If the article is not in the catalog return "Nothing".

# Notes
- There is a blank line between two lines of the catalog.
- The same article may appear more than once. If that happens return all the lines concerned by the article (in the same order as in the catalog).
- The line separator of results may depend on the language `\n`or `\r\n`.
  You can see examples in the "Sample tests".
