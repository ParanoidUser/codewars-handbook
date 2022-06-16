# [Chaser's schedule](https://www.codewars.com/kata/chasers-schedule "https://www.codewars.com/kata/628df6b29070907ecb3c2d83")

A runner, who runs with base speed `s` with duration `t` will cover a distances `d`: `d = s * t`
However, this runner can sprint for one unit of time with double speed `s * 2`
After sprinting, base speed s will permanently be reduced by `1`, and for next one unit of time
runner will enter recovery phase and can't sprint again.

Your task, given base speed `s` and time `t`, is to find the maximum possible distance `d`.

## Input:

`1 <= s < 1000`
`1 <= t < 1000`

## Example:

Given `s = 2` and `t = 4`.
We could schedule when runner should sprint so we could get these possible sequences:

```
Seq.: RRRR
=> s + s + s + s
=> 2 + 2 + 2 + 2 = 8
Seq.: RRRS
=> s + s + s + s*2
=> 2 + 2 + 2 + 2*2 = 10
Seq.: RRSR
=> s + s + s*2 + (s-1)
=> 2 + 2 + 2*2 + (2-1) = 9
Seq.: RSRR
=> s + s*2 + (s-1) + (s-1)
=> 2 + 2*2 + (2-1) + (2-1) = 8
Seq.: RSRS
=> s + s*2 + (s-1) + (s-1)*2
=> 2 + 2*2 + (2-1) + (2-1)*2 = 9
Seq.: SRRR
=> s*2 + (s-1) + (s-1) + (s-1)
=> 2*2 + (2-1) + (2-1) + (2-1) = 7
Seq.: SRRS
=> s*2 + (s-1) + (s-1) + (s-1)*2
=> 2*2 + (2-1) + (2-1) + (2-1)*2 = 8
Seq.: SRSR
=> s*2 + (s-1) + (s-1)*2 + (s-1-1)
=> 2*2 + (2-1) + (2-1)*2 + (2-1-1) = 7

Where:
- R: Normal Run / Recovery
- S: Sprint
```

Based on above sequences, the maximum possible distance `d` is `10`.