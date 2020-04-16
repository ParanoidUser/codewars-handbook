# [Load value from system variable](https://www.codewars.com/kata/load-value-from-system-variable "https://www.codewars.com/kata/5b18ff8e7500be2d7f00003c")

Your task is to load the system property (or system variable) named as `name` and inject/assign the value into a variable that should be printed when calling some method.

Such variable will have different values in your test environment and production environment.

If you fail to assign the value you will get a horrible null printed as part of the method call.

Note: to reproduce it in your local environment you don't have to add the system variables