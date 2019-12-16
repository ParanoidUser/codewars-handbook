# [Password System](https://www.codewars.com/kata/password-system "https://www.codewars.com/kata/57a23e3753ba332b8e0008da")

<p>In Star Labs we use password system to unlock the lab doors and only Team Flash is given the password for these labs. Password system comprises of <b>n x n</b> keypad (n>0).</p>
<p>One day Zoom saw Cisco using the password. He figured out that the password is symmetric about the centre point (centre point for n*n keypad will be point with co-ordinates (n/2, n/2)). Now he has to try all possible symmetric combinations to unlock the door. Since he has not enough time he asks you to tell if given password is symmetric or not.</p>
<p>You will be given a m x n binary grid containing elements as 0 if that key is not used and 1 if that key is used. You need to tell whether the given binary grid is symmetric according to the centre point. The grid might not be square.</p>

<h1>Your Task</h1>

Write a function ```helpZoom()``` that takes an array of integers containing 0 and 1 as input and returns "Yes" or "No" depending on whether the given password is symmetric or not.

<h2>Example</h2>
```
helpZoom({1,1,0,0,0,0,0,1,1}) => "Yes"
```

Since the given password is symmetric along centre point, so the answer is Yes. For ease of understanding, the above array can be represented as follows:

<p>1  1  0</p>
<p>0  0  0</p>
<p>0  1  1</p>

```
helpZoom({1,1,0,0,1,0,0,1}) => "No" 
```

Notice that the given array cannot be represented as a n x n matrix, so it's invalid.
```
helpZoom({1,0,1,1,0,0,0,0,0}) => "No" 
```

Since the given password isn't symmetric along centre point, so the answer is No.