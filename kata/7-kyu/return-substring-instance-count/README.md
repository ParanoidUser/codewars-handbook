# [Return substring instance count](https://www.codewars.com/kata/return-substring-instance-count "https://www.codewars.com/kata/5168b125faced29f66000005")

Write a function that takes two string parameters `search_text` and `full_text` and returns the number of times the `search_text` is found within the `full_text`.

* Overlap is not permitted: `"aaa"` contains `1` instance of `"aa"`, not `2`.
* `search_text` will never be empty.

## Examples:

```javascript
full_text = "aa_bb_cc_dd_bb_e", search_text = "bb"
--> should return 2 since "bb" shows up twice


full_text = "aaabbbcccc", search_text = "bbb"
--> should return 1
```
