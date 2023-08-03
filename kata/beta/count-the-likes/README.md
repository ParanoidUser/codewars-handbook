# [Count the likes](https://www.codewars.com/kata/count-the-likes "https://www.codewars.com/kata/5532686f0408dfe458000117")

Your grandfather criticises your overuse of the word 'like', claiming that it makes up more than 5% of the total words you speak. 

You argue that it is much lower than this and so to settle the debate, you have been fitted with a recorder that stores every word you say as a string in an array.

Your task is to make an algorithm that returns true if 'like' accounts for more than 5% of words in the array, otherwise false (if no words are spoken, return false also).

```
Kata.evalLikes(new String[] {"I", "am", "sooo", "like", "tired"}) // ==> true;
Kata.evalLikes(new String[] {"THIS", "IS", "LIKE", "TERRIBLE"}) // ==> true;
Kata.evalLikes(new String[] {"likely", "story"}) // ==> false;
```

Your solution must be case-insensitive, but you do not need to worry about punctuation (the device you have been fitted with automatically filters this out).
