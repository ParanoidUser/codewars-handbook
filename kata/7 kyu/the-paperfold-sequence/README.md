# [The PaperFold sequence](https://www.codewars.com/kata/the-paperfold-sequence "https://www.codewars.com/kata/5d26721d48430e0016914faa")

[Wikipedia](https://en.wikipedia.org/wiki/Regular_paperfolding_sequence): The **regular paperfolding sequence**, also known as the **dragon curve sequence**, is an infinite automatic sequence of `0`s and `1`s defined as the limit of the following process:

<span style="color:aqua">1</span>  
<span style="color:aqua">1</span> 1 <span style="color:aqua">0</span>  
<span style="color:aqua">1</span> 1 <span style="color:aqua">0</span> 1 <span style="color:aqua">1</span> 0 <span style="color:aqua">0</span>  
<span style="color:aqua">1</span> 1 <span style="color:aqua">0</span> 1 <span style="color:aqua">1</span> 0 <span style="color:aqua">0</span> 1 <span style="color:aqua">1</span> 1 <span style="color:aqua">0</span> 0 <span style="color:aqua">1</span> 0 <span style="color:aqua">0</span>  

At each stage an alternating sequence of `1`s and `0`s is inserted between the terms of the previous sequence.
```
Define a generator `PaperFold` that sequentially generates the values of this sequence.
```

It will be tested for up to `1 000 000` values.