# Unit 3 - Decision Structures

## [**L9 Sandbox**][sandbox]

## Switch Statements

Nested if-statements are messy and even if-else-if statements can get complicated and hard to read. But, there is a nicer, prettier solution: [**Switch Statements**](https://www.tutorialspoint.com/java/switch_statement_in_java.htm).

The syntax is as follows: 

```
switch (switchExpression)
{
    case CaseExpression:
        //code block
        break;
    case CaseExpression2:
        //code block
        break;
    default:
        //code block
}
```

Let's unpack this thing: 

* `switch` - is a keyword which tells JAva that the following is a switch statement, much like `if`
* "switchExpression" - this is a `int`, `char` or `String` variable, the value of which must match the "CaseExpression"
* `case` - another keyword which tells Java to match the "CaseExpression" to the "SwitchExpression".
* "CaseExpression" - must match one of the values of the "SwitchExpression"
* "code block" - are the statements to execute when the match is true
* `break` - break statements are super helpful. This keyword tells Java to exit the switch statement.  
* 'default' - this is the block of code to execute if none of the "CaseExpressions" match the "Switch Expressions".

A good use of the Switch statement is to convert `int` that represent the days of the week, or months of the year, to their String counterparts or vice versa.

Let's flush this out in the [**Sandbox**][sandbox]


[sandbox]:../L9.java