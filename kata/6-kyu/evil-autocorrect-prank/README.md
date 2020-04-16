# [Evil Autocorrect Prank](https://www.codewars.com/kata/evil-autocorrect-prank "https://www.codewars.com/kata/538ae2eb7a4ba8c99b000439")

Your friend won't stop texting his girlfriend.  It's all he does. All day. Seriously.  The texts are so mushy too! The whole situation just makes you feel ill.
Being the wonderful friend that you are, you hatch an evil plot.  While he's sleeping, you take his phone and change the autocorrect options so that every time he types "you" or "u" it gets changed to "your sister."

Write a function called <code>autocorrect</code> that takes a string and replaces all instances of <code>"you"</code> or <code>"u"</code> (not case sensitive) with <code>"your sister"</code> (always lower case).

Return the resulting string.

Here's the slightly tricky part: These are text messages, so there are different forms of "you" and "u".

For the purposes of this kata, here's what you need to support:
<ul>
<li>"youuuuu" with any number of u characters tacked onto the end</li>
<li>"u" at the beginning, middle, or end of a string, but NOT part of a word</li>
<li>"you" but NOT as part of another word like youtube or bayou</li>
</ul>
<p>
