# [Simple Fun #74: Growing Plant](https://www.codewars.com/kata/simple-fun-number-74-growing-plant "https://www.codewars.com/kata/58941fec8afa3618c9000184")

# Task
 Each day a plant is growing by `upSpeed` meters. Each night that plant's height decreases by `downSpeed` meters due to the lack of sun heat. Initially, plant is 0 meters tall. We plant the seed at the beginning of a day. We want to know when the height of the plant will reach a certain level.

# Example

 For `upSpeed = 100, downSpeed = 10 and desiredHeight = 910`, the output should be `10`.
 
 ```
 After day 1 --> 100
 After night 1 --> 90
 After day 2 --> 190
 After night 2 --> 180
 After day 3 --> 280
 After night 3 --> 270
 After day 4 --> 370
 After night 4 --> 360
 After day 5 --> 460
 After night 5 --> 450
 After day 6 --> 550
 After night 6 --> 540
 After day 7 --> 640
 After night 7 --> 630
 After day 8 --> 730
 After night 8 --> 720
 After day 9 --> 820
 After night 9 --> 810
 After day 10 --> 910 
 ```
 
 For `upSpeed = 10, downSpeed = 9 and desiredHeight = 4`, the output should be `1`.
 
 Because the plant reach to the desired height at day 1(10 meters).
 
 ```
 After day 1 --> 10
 ```

# Input/Output

```if-not:sql
 - `[input]` integer `upSpeed`

    A positive integer representing the daily growth.

    Constraints: `5 ? upSpeed ? 100.`


 - `[input]` integer `downSpeed`

    A positive integer representing the nightly decline.

    Constraints: `2 ? downSpeed < upSpeed.`


 - `[input]` integer `desiredHeight`

    A positive integer representing the threshold.

    Constraints: `4 ? desiredHeight ? 1000.`

 - `[output]` an integer

    The number of days that it will take for the plant to reach/pass desiredHeight (including the last day in the total count).
```
```if:sql
## Input

~~~
-----------------------------------------
|     Table     |    Column      | Type |
|---------------+----------------+------|
| growing_plant | down_speed     | int  |
|               | up_speed       | int  |
|               | desired_height | int  |
-----------------------------------------
~~~

### Columns
* `up_speed`: A positive integer representing the daily growth. Constraints: `5 ? up_speed ? 100.`
* `down_speed`: A positive integer representing the nightly decline. Constraints: `2 ? down_speed < up_speed.`
* `desired_height`: A positive integer representing the threshold. Constraints: `4 ? desired_height ? 1000.`

## Output

~~~
-------------------
|  Column  | Type |
|----------+------|
| id       | int  |
| num_days | int  |
-------------------
~~~

`num_days` is the number of days that it will take for the plant to reach/pass desiredHeight (including the last day in the total count).
```