[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=19311482)
# unit-7-4-assignment

## Git Config
```
git config user.name "user"
git config user.email "email"
```

## Compiling and Running Java Programs
Note that since our classes are separate classes, you will need to compile ALL the files (at least one time).  You can do this by running
```
javac *.java
```
The star means to compile every file that is a Java file type.

Run your code by running
```
java Main
```

After you compile the shape classes, you only need to compile and run `Main.java` as usual.

# Instructions  

## Problem 1
Implement the method `countSecondInitial` which accepts as parameters an `ArrayList` of `Strings` and a letter, stored in a `String`. (Precondition: the `String` variable `letter` has only one character. You do not need to check for this.) The method should return the number of `Strings` in the input `ArrayList` that has the target `letter` as the second letter in the word.

In the sample run below, we look for the letter `"i"`, and get the number 3, since the words `"find"`, `"dice"`, and `"hi"` all have the letter `"i"` as the second letter in those words.

Sample Run:
```
Please enter words, enter STOP to stop the loop.
find
dice
hi
dye
STOP
Enter the letter to search for
i
Search for i: 3
```
Hint - the algorithm to implement this method is just a modified version of the linear search algorithm.

## Problem 2
Write a public static method named `searchSecond` which implements a modified version of the linear search algorithm on an `ArrayList` of `String` objects. Instead of returning the index of the first appearance of the target `String` in the `ArrayList` your method should return the index of the second appearance of this String. If the target `String` is not in the `ArrayList` or only appears once, your method should return -1.

Sample Run 1: 
```
Please enter words, enter STOP to stop the loop.
apple
bird
cat
apple
apple
STOP
Enter String to search for.
apple
searchSecond returns: 3
```
Sample Run 2:
```
Please enter words, enter STOP to stop the loop.
apple
bird
apple
cat
apple
STOP
Enter String to search for.
bird
searchSecond returns: -1 
```
Sample Run 3:
```
Please enter words, enter STOP to stop the loop.
apple
bird
apple
cat
apple
STOP
Enter String to search for.
dog
searchSecond returns: -1
```
