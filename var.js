/* var keyword is also way to declare a variable 
It is one of the oldes method but as the 
language developed people started using let and const

when you declare a variable with var
it becomes function-scoped
this if means if you declare a variable inside
a function it's only accessible within that fucntion.

How ever if we declare it outside any function
it becomes a global variable
this behaviour can sometimes lead to
unexpected results and make your code harder 
to reason about

// the problem with var is that it allows 
you to redeclare the same variable multiple 
times without throwing an error

This behavior can lead to unitended varable leaks and make 
your code more prone to bugs.

Due to this issues, modern JavaScript development
has largely moved away from var in favor let 
and cosnt.
These keywords provide block scoping which
aligns more closely with how scoping works in 
many other programming languages. */

var x = 10;

if (true) {
  var x = 20;
  console.log(x);
}

console.log(x);