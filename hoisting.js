/* what is hoisting
to understand hoisting
it is important to know that 
JS runs into two phases:
the compilation phase and the execution phase.
During the compilation phase, the JS engines goes through 
your code and sets up memory space for variables and fucntions.
this is where hoisting comes into play.

when you declare a variable using a var keyword, it pulls the declaration
to the top of its scope.
But only variable is moved up not the value.
This means you can use a variable in your code before you have
declared it, but its value will be undefined until you actually assign 
a value to it.
*/
console.log(x);// undefined
var x=5;
console.log(5);//5

/*
In this code even though we use x before declaring it,
we don't get an error,
instead we get undefined.
This is because JavaScript hoists the declaration 
