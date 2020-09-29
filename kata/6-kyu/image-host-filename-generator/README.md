# [Image host filename generator](https://www.codewars.com/kata/image-host-filename-generator "https://www.codewars.com/kata/586a933fc66d187b6e00031a")

You are developing an image hosting website.

You have to create a function for generating random and unique image filenames.

Create a function for generating a random 6 character string which will be used to access the photo URL. 

To make sure the name is not already in use, you are given access to an PhotoManager object.

You can call it like so to make sure the name is unique

```
// at this point, the website has only one photo, hosted on the 'ABCDEF' url
photoManager.nameExists("ABCDEF"); // returns true
photoManager.nameExists("BBCDEF"); // returns false
```

<strong>Note:</strong> We consider two names with same letters but different cases to be unique.