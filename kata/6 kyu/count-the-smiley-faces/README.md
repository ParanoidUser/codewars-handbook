# [Count the smiley faces!](https://www.codewars.com/kata/count-the-smiley-faces "https://www.codewars.com/kata/583203e6eb35d7980400002a")

<font size="5">Description:</font><br>
Given an array (arr) as an argument complete the function `countSmileys` that should return the total number of smiling faces.<br>
<font size="4">Rules for a smiling face:</font><br>
-Each smiley face must contain a valid pair of eyes.
Eyes can be marked as `:` or `;`<br>
-A smiley face can have a nose but it does not have to.
Valid characters for a nose are `-` or `~`<br>
-Every smiling face must have a smiling mouth that should be marked with either
`)` or `D`.<br>
No additional characters are allowed except for those mentioned.<br>
<strong>Valid smiley face examples:</strong><br>
`:) :D ;-D :~)`<br>
<strong>Invalid smiley faces:</strong><br>
`;( :> :} :]`
<br><br>
<strong>Example cases:</strong><br>
```
countSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;
```
<br>
<b>Note:</b> In case of an empty array return 0. You will not be tested with invalid input (input will always be an array). Order of the face (eyes, nose, mouth) elements will always be the same
