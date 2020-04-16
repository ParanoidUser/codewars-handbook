# [WASD Movement](https://www.codewars.com/kata/wasd-movement "https://www.codewars.com/kata/5a1428eb6975989403000136")

Complete the method ```public float[] getVector(boolean[] wasd)``` to calculate the players movement vector resulting from user input to the WASD keys. 
 
The method accepts an array of 4 ```boolean``` values representing the pressed state of the W, A, S and D keys where ```true``` indicates the key is pressed. Any number of keys may be pressed at a time. 
 
The method should return a ```float``` array of size 2 representing the x any y components of the resulting movement vector where W and S map to positive and negative y respectively and A and D map to negative and positive x respectively. 
 
 
The players should always move at speed 1. 