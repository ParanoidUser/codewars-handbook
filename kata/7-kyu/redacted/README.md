# [Redacted!](https://www.codewars.com/kata/redacted "https://www.codewars.com/kata/5b662d286d0db722bd000013")

Your job is to compare two confidential documents that have come into your possession.

The first document has parts [redacted](https://www.merriam-webster.com/dictionary/redacted), and
the other one doesn't.

![](https://i.imgur.com/8BSbFEy.png)

But the original (unredacted) document might be a fake!

You need to compare the two documents and decide if it is *possible* they are the **same** or not.

## Task

Return `true` if the two documents are possibly the same. Return `false` otherwise.

## Notes

* Each document is made of any visible characters, spaces, punctuation, and newlines `\n`
* Any character might be redacted (except `\n`)
* The redaction character is `X`
* The redacted document is always the first one

## Examples

<style>
#mytable {
  width: 75%;
  margin-bottom: 20px;
}

#mytable #myth, #mytd {
  border-collapse: collapse;
  border: 2px solid gray;
  padding: 3px 15px 3px 15px;
}
</style>

<table id="mytable">
<tr id="mytr"><th id="myth">Document 1 (redacted)<th id="myth">Document 2 (original)<th id="myth">Possibly&nbsp;Same?</tr>
<tr>
<td id="mytd">
<pre style='background-color:white;color:gray'>
TOP SECRET:
The missile launch code for Sunday <span style='background-color:black'>XXXXXXXXXX</span> is:
<span style='background-color:black'>XXXXXXXXXXXXXXXXX</span></pre>
<td id="mytd">
<pre style='background-color:white;color:gray'>
TOP SECRET:
The missile launch code for Sunday 5th August is:
7-ZERO-8X-ALPHA-1</pre>
<td id="mytd">
true
</tr>

<tr>
<td id="mytd">
<pre style='background-color:white;color:gray'>
The name of the mole is Professor <span style='background-color:black'>XXXXX</span></pre>
<td id="mytd">
<pre style='background-color:white;color:gray'>
The name of the mole is Professor Plum</pre>
<td id="mytd">
false
</tr>

<tr>
<td id="mytd">
<pre style='background-color:white;color:gray'>
<span style='background-color:black'>XXXXXXXX</span> <span style='background-color:black'>XXXXXXX</span> <span style='background-color:black'>XXXXXXXXXXXXXXXXXXX</span>
<span style='background-color:black'>XXXX</span> <span style='background-color:black'>XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX</span> <span style='background-color:black'>XXXXXXXXX</span> <span style='background-color:black'>XXXXXXXXXXXXX</span> <span style='background-color:black'>XXXXX</span></pre>
<td id="mytd">
<pre style='background-color:white;color:gray'>
Area-51. Medical Report. 23/Oct/1969
E.T. subject 4 was given an asprin after reporting sick for duty today</pre>
<td id="mytd">
true
</tr>

</table>