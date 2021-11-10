# Unit 3 - Decision Structures

## [**L6 Sandbox**][sandbox]

## If-Else-If Statements

**If-Statements** don't just stop at else, we can add another if-statement after the else creating a chain of if-else-if statements. 

The best example of an If-Else chain, is assigning a letter grade to percentage grades. For simplicity, let's say that 90+ is an A, 80-89 B, 70-79 C, 60-69 D, 59- F. There are a number of ways to complete this program. We will look at a few of them. 

```java
import java.util.Scanner;
public class L5{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        //GET INPUT
        System.out.print("Enter your percentage grade:");
        boolean percentage = read.nextDouble();
        char grade; 
        
        //DETERMINE LOGIC
        if(percentage < 59 )
            grade = 'F';
        else if(percentage > 60)
            grade = 'D';
        else if(percentage > 70)
            grade = 'C';
        else if(percentage > 80)
            grade = 'B';
        else 
            grade = 'A';
    }
}
``` 

_Does this program work as intended? Why or Why not?_

Let's work through some different ways to code this program in the [**Sandbox**][sandbox].

[sandbox]:../L6.java