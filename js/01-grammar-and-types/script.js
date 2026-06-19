/* https://developer.mozilla.org/en-US/docs/Web/JavaScript */

// Declares a variable, optionally initialising it to a value
var x;

// Declares a block-scoped, local variable, optionally initialising it to a value
let y;

// Declares a block-scoped, read-only named constant. `const` always needs an initialiser
const z = 42;

// print
let greeting = "Hello, World!";
console.log(greeting);

// undefined
console.log(x);

// function examples
const rollNumbers = [101, 102, 103];

function PrintResult(rollNum) {
  alert("username with roll number: " + rollNum + " has passed the exam.");
}

// loops
for (let i = 0; i < rollNumbers.length; i++) {
  PrintResult(rollNumbers[i]);
}
