# [The Baum-Sweet sequence](https://www.codewars.com/kata/the-baum-sweet-sequence "https://www.codewars.com/kata/5d2659626c7aec0022cb8006")

[Wikipedia](https://en.wikipedia.org/wiki/Baum%E2%80%93Sweet_sequence): The Baum–Sweet sequence is an infinite automatic sequence of `0`s and `1`s defined by the rule:

b<sub>n</sub> = `1` if the binary representation of `n` contains no block of consecutive `0`s of odd length; 
b<sub>n</sub> = `0` otherwise;

for `n ≥ 0`.

~~~if:javascript,php,coffeescript,typescript,
Define a generator function `baumSweet` that sequentially generates the values of this sequence.
~~~
~~~if:go,
Define a generator function `BaumSweet` that sequentially generates the values of this sequence.
~~~
~~~if:kotlin,
Define an iterator function `baumSweet` that sequentially generates the values of this sequence.
~~~
~~~if:haskell,
Define a list `baumSweet` that contains the values of this sequence.
~~~
~~~if:lambdacalc,
Define a stream `baumSweet` that contains the values of this sequence.
~~~
~~~if:fsharp,scala
Define a lazy sequence `baumSweet` that contains the values of this sequence.
~~~
~~~if:python,
Define a generator function `baum_sweet` that sequentially generates the values of this sequence.
~~~
~~~if:csharp,java,
Define an iterator `BaumSweet` that sequentially generates the values of this sequence.
~~~
~~~if:ruby,
Define a class `BaumSweet`, instantiating to an `Enumerator` that sequentially generates the values of this sequence.
~~~
~~~if:julia,
Define a function `baumsweet` that returns a `Generator` that sequentially generates the values of this sequence.
~~~
~~~if:lua,
Define an iterator `baumsweet` that sequentially generates each n and the n<sup>th</sup> value of this sequence.
~~~

~~~if-not:lambdacalc,
It will be tested for up to `1 000 000` values.
~~~
~~~if:lambdacalc,
It will be tested for up to `32k` values.
~~~

Note that the binary representation of `0` used here is not `0` but the empty string ( which does not contain any blocks of consecutive `0`s ).

~~~if:lambdacalc
---

#### Encodings

purity: `LetRec` 
numEncoding: `BinaryScott` 
export deconstructors `head, tail` for your `Stream` encoding ( a `Stream` is just an infinite `List`, without a `Nil` constructor ) 
~~~
