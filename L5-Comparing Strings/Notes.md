# Unit 3 - Decision Structures

## [**L7 Sandbox**][sandbox]

## Comparing Strings

Let's dive deeper into objects. When we create an object, Java creates space for that object and gives it an address. When we access data from the object, we are accessing the address and retrieving that information. 

Take a look at the [**Pet**][pet] class.

When `Pet myPet = new Pet("Butch", "5")` is executed space is made for the data contained in the `Pet` object, `name` and `age`, and an address given to `myPet` so when we call `myPet.getName()`, in short, we are telling Java to go to the `myPet` address and retrieve the `name` value. 

When comparing objects, you need to keep in mind that an object is an address and each address is different, just like each house address is different. 

Let's create two pet objects and compare them in the [**Sandbox**][sandbox]. Run the code.
```java
public class L7{
    public static void main(String[] args){
        Pet myPet = new Pet("Butch", "5");
        Pet yourPet = new Pet("Butch", "5");
        
        System.out.println(myPet == yourPet);
    }
}
```
We have created two objects with exactly the same values. However, if we attempt to compare these two objects we get some interesting results. `myPet` is not equal to `yourPet`. _WHY?_  Because `myPet` and `yourPet` refers to an address where data is stored and they have different addresses.

We could change this to `myPet.getName() == yourPet.getName()` but even though the output still display the correct comparison this is not the acceptable way to compare because `name` is a String and Strings are objects which behave exactly like any other object. 

### .equals()

The `String` class provides a number of methods to compare String data. 

* `word1.equals(word2)` - returns true if word1 and word2 are EXACTLY the same, case-sensitive.
* `word1.equalsIgnoreCase(word2)` - returns true if word1 and word2 are the same characters, not case-sensitive.

Let's explore these two methods in the [**Sandbox**][sandbox]

[sandbox]:../L7.java
[pet]: ../Pet.java