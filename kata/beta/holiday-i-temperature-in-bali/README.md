# [Holiday I - Temperature in Bali](https://www.codewars.com/kata/holiday-i-temperature-in-bali "https://www.codewars.com/kata/57e8e9df2aee49c0280009ab")

So it turns out the weather in Indonesia is beautiful... but also far too hot most of the time.

Given two variables: `heat` (0 - 50 degrees centigrade) and `humidity` (scored from 0.0 - 1.0), your job is to test whether the weather is bearable (according to my personal preferences :D)

* If the `humidity` is over `0.5`, or `heat` is above `35`, it's not bearable - return `false`.
* If `heat` is more than `25` but less than `36`, bearability depends on humidity. If `humidity` is above `0.4` in this scenario, return `false`.
* If `heat` is less than or equal to `25` return `false`.
* Otherwise... it's sunbathing time, so return `true`!