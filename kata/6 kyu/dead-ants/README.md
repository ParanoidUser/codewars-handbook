# [Dead Ants](https://www.codewars.com/kata/dead-ants "https://www.codewars.com/kata/57d5e850bfcdc545870000b7")

An orderly trail of ants is marching across the park picnic area.

It looks something like this:

<pre style="background:black;margin-bottom:20px">
..ant..ant.ant...ant.ant..ant.ant....ant..ant.ant.ant...ant..
</pre>

But suddenly there is a rumour that a dropped chicken sandwich has been spotted on the ground ahead. The ants surge forward! *Oh No, it's an ant stampede!!*

Some of the slower ants are trampled, and their poor little ant bodies are broken up into scattered bits.

The resulting carnage looks like this:

<pre style="background:black;margin-bottom:20px">
...ant...ant..<span style="color:red">nat</span>.ant.<span style="color:red">t</span>..ant...ant..ant..ant.<span style="color:red">an</span>ant..<span style="color:red">t</span>
</pre>

Can you find how many ants have died?

<hr>

## Notes

* When in doubt, assume that the scattered bits are from the same ant. e.g. 2 heads and 1 body = 2 dead ants, not 3