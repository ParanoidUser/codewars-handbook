# [AD2070: Help Lorimar troubleshoot his robots- ultrasonic distance analysis](https://www.codewars.com/kata/ad2070-help-lorimar-troubleshoot-his-robots-ultrasonic-distance-analysis "https://www.codewars.com/kata/57102bbfd860a3369300089c")

The year is 2070 and intelligent connected machines have replaced humans in most things. There are still a few critical jobs for mankind including machine software developer, for writing and maintaining the AI software, and machine forward deployed engineer for controlling the intelligent machines in the field. 
Lorimar is a forward deployed machine engineer and at any given time he controls thousands of BOT robots through real time interfaces and intelligent automation software. These interfaces are directly connected to his own brain so at all times his mind and the robots are one. They are pre-trained to think on their own but on occasion the human will direct the robot to perform a task. 

There is an issue with the ultrasonic sensor data feed from BOT785 currently connected to Lorimar through a real time interface. The data feed from sensor five should be a series of floats representing the relative distance of objects within BOT785's path. The sensor error log has been saved for triage and Lorimar needs to search through the data to determine the mean and standard deviation of the distance variables. 

You will be given a list of tuples extracted from the sensor logs:

```
sensor_data = [('Distance:', 116.28, 'Meters', 'Sensor 5 malfunction =>lorimar'), ('Distance:', 117.1, 'Meters', 'Sensor 5 malfunction =>lorimar'), ('Distance:', 123.96, 'Meters', 'Sensor 5 malfunction =>lorimar'), ('Distance:', 117.17, 'Meters', 'Sensor 5 malfunction =>lorimar')]
```

Return a tuple with the mean and standard deviation of the distance variables rounded to four decimal places. The variance should be computed using the formula for samples (dividing by N-1).


|Mean|   |Standard Deviation|
```
(118.6275, 3.5779)
```

Hint (https://math.stackexchange.com/questions/15098/sample-standard-deviation-vs-population-standard-deviation)