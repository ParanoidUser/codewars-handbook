# [Change case](https://www.codewars.com/kata/change-case "https://www.codewars.com/kata/591cac98a6007e87d900013a")

In a Word document, there is a button called Change case in Home tab where you can change the capitalization or case of selected text in a document.

## Task

Write five functions:
<pre>
<code><strong><u>toSentenceCase</u></strong> - Uppercase only first letter in sentence.
EXAMPLE: 
<strong>toSentenceCase</strong>(String <span>"hello world"</span>)
//Output: Hello world
Think about <span>".?!"</span>, capitalize only after them: <span>"hello. world"</span> -> <span>"Hello. World"</span></code>
</pre>
<pre>
<code class="lang-java"><strong><u>toLowerCase</u></strong> - lowercase every letter.
EXAMPLE: 
<strong>toLowerCase</strong>(String <span>"HeLLo WoRld"</span>)
//Output: hello world</code>
</pre>
<pre>
<code class="lang-java"><strong><u>toUpperCase</u></strong> - uppercase every letter.
EXAMPLE: 
<strong>toUpperCase</strong>(String <span>"HeLLo WoRld"</span>)
//Output: HELLO WORLD</code>
</pre>
<pre>
<code class="lang-java"><strong><u>capitalizeEachWord</u></strong> - capitalize first letter in each word.
EXAMPLE: 
<strong>capitalizeEachWord</strong>(String <span>"heLLo woRld"</span>)
//Output: Hello World</code>
</pre>
<pre>
<code class="lang-java"><strong><u>toToggleCase</u></strong> - uppercase letter change to lowercase and lowercase to uppercase.
EXAMPLE: 
<strong>toToggleCase</strong>(String <span>"heLLo woRld"</span>)
//Output: HEllO WOrLD</code>
</pre>