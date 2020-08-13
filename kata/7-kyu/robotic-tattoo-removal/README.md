# [Robotic Tattoo Removal](https://www.codewars.com/kata/robotic-tattoo-removal "https://www.codewars.com/kata/57658f3dedc6f7a751000e7b")

<img src="https://media.timeout.com/images/102748305/image.jpg" alt="Drawing" style="width: 335px;"/>

Sometimes people get tattoos, sometimes they wish they hadn't, sometimes the tattoos must go. Let's create a robot that can remove tattoos.

Your ```robot``` function accepts one array argument called ```skinScan```. I have supplied an example array below.

```
[
[' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '],
[' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '],
[' ',' ','X','X',' ',' ',' ','X','X',' ',' '],
[' ','X',' ',' ','X',' ','X',' ',' ','X',' '],
[' ','X',' ',' ',' ','X',' ',' ',' ','X',' '],
[' ','X',' ',' ',' ','X',' ',' ',' ','X',' '],
[' ','X',' ',' ',' ',' ',' ',' ',' ','X',' '],
[' ','X',' ',' ',' ',' ',' ',' ',' ','X',' '],
[' ','X',' ',' ',' ',' ',' ',' ',' ','X',' '],
[' ',' ','X',' ',' ',' ',' ',' ','X',' ',' '],
[' ',' ',' ','X',' ',' ',' ','X',' ',' ',' '],
[' ',' ',' ',' ','X',' ','X',' ',' ',' ',' '],
[' ',' ',' ',' ',' ','X',' ',' ',' ',' ',' '],
[' ',' ',' ',' ',' ','X',' ',' ',' ',' ',' '],
[' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '],
[' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ']
]
```

Your task is to create a function for the ```robot``` function that will zap away the ```X```s and replace them with ```*```s. Any array values that are not ```X```s must be left alone. Below is what ```skinScan``` should look like after the tattoo has been removed. 

```
[
[' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '],
[' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '],
[' ',' ','*','*',' ',' ',' ','*','*',' ',' '],
[' ','*',' ',' ','*',' ','*',' ',' ','*',' '],
[' ','*',' ',' ',' ','*',' ',' ',' ','*',' '],
[' ','*',' ',' ',' ','*',' ',' ',' ','*',' '],
[' ','*',' ',' ',' ',' ',' ',' ',' ','*',' '],
[' ','*',' ',' ',' ',' ',' ',' ',' ','*',' '],
[' ','*',' ',' ',' ',' ',' ',' ',' ','*',' '],
[' ',' ','*',' ',' ',' ',' ',' ','*',' ',' '],
[' ',' ',' ','*',' ',' ',' ','*',' ',' ',' '],
[' ',' ',' ',' ','*',' ','*',' ',' ',' ',' '],
[' ',' ',' ',' ',' ','*',' ',' ',' ',' ',' '],
[' ',' ',' ',' ',' ','*',' ',' ',' ',' ',' '],
[' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '],
[' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ']
]
```