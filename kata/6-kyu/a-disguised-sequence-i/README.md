# [A disguised sequence (I)](https://www.codewars.com/kata/a-disguised-sequence-i "https://www.codewars.com/kata/563f0c54a22b9345bf000053")

Given <code>u<sub>0</sub> = 1, u<sub>1</sub> = 2</code> and the relation
<code>6u<sub>n</sub>u<sub>n+1</sub>-5u<sub>n</sub>u<sub>n+2</sub>+u<sub>n+1</sub>u<sub>n+2</sub> = 0</code>
calculate <code>u<sub>n</sub> for any integer n >= 0</code>.

## Examples

fcn(n) returns <code>u<sub>n</sub></code>: 
` fcn(17) -> 131072, fcn(21) -> 2097152`

## Remark
You can take two points of view to do this kata: 

- the first one purely algorithmic from the definition of <code>u<sub>n</sub></code>

- the second one - not at all mandatory, but as a complement - is to get a bit your head around and find which sequence is hidden behind <code>u<sub>n</sub></code>. 
