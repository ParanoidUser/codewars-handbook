# [Read the time](https://www.codewars.com/kata/read-the-time "https://www.codewars.com/kata/5c2b4182ac111c05cf388858")

Given time in 24-hour format, convert it to words. 

## Example

```
13:00 = one o'clock 
13:09 = nine minutes past one 
13:15 = quarter past one 
13:29 = twenty nine minutes past one
13:30 = half past one 
13:31 = twenty nine minutes to two
13:45 = quarter to two 
00:48 = twelve minutes to one
00:08 = eight minutes past midnight
12:00 = twelve o'clock
00:00 = midnight
```

## Note:

If minutes == 0, use 'o'clock'. If minutes <= 30, use 'past', and for minutes > 30, use 'to'. 