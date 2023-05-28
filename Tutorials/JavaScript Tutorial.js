// JavaScript Tutorial
// @author Forrest Wang
// This file is a guide to basic syntax of JavaScript from the concepts learned from Codecademy.

// Comments:
// Comments use the same syntax as Java; these are single line comments.
/* 
 * These are multi-line/block comments.
*/ 



// Output:
console.log("Output:");
console.log("----------------------------------------------------");
console.log('This is similar to System.out.println(); in Java.');
console.log(); // An empty console.log(); statement will start on a new line.
console.log("You can also surround the text inside with double-quotes. This removes the need for escape seqeunces.");
console.log('Escape sequences use \ before a special character, like \', and  \".');



// Variables:
console.log("Variables:")
console.log("----------------------------------------------------");

let string1 = "let and const are the only keywords used for declaring variables and constants respetively.";
const STRING_2 = "Variables and constants can be stored as a string or number, but constants cannot be changed.";

const STRING_3 = 'or even numbers like '
const STRING_4 = "They can be concatonated " + "with other strings, " + string3 + 3 + '.';

const STRING_5 = "Algebra and syntax in JavaScript is the same as Java.";

console.log(string1);
console.log(string2);
console.log(string4);
console.log(string5);



// Conditionals:
console.log("Conditionals:")
console.log("----------------------------------------------------");

const A = 5;
const STRING_A = "5";

console.log("If, else if, else, and switch statements mostly use the same syntax as Java.");
console.log("The main difference between JavaScript and Java with conditionals is the equals comparison operator.");

if (a == stringA && a !== stringA) {
	console.log("== compares the values of both variables, regardless if one is a string and one is a number.");
	console.log("Hence, the first condition in the if statement above is true.");
	console.log("=== compares both the values of both variables, and the variable type.");
	console.log("Hence, the second condition in the if statement above is true.");
	console.log(">, <, &&, ||, and ! work the same way as they do in Java, as shown above.");

}

console.log("JavaScript also has a conditional or tenerary operator designed to assign values to a variable based on some condition.");

const AGE = 25;
const VOTEABLE = (age < 18) ? "too young to vote.":"old enough to vote.";

console.log("For example, " + age + " is " + voteable);

// For some reason the nullish coalescing operator (??) does not run.
/* console.log("The Nullish Coalescing Operator (??) returns the second argument if the first argument is null or undefined.");

let string6 = null;
let nullWarning = "For example, string6 is null.";
let string6OrNull = string6 ?? nullWarning;

console.log(string6OrNull); */



// Arrays:
console.log("Arrays:")
console.log("----------------------------------------------------");
console.log("The syntax for arrays is the same as Java, except you can initilize one with the keywords let or const.");

let fiveLetters = ["a", "a", "c", "d", "a"];

console.log("Indexing and changing elements are also the same as Java.");

fiveLetters[1] = "b";

console.log("Array: " + fiveLetters);

const NUMBER_CLUSTERS = [[1, 2], [3, 4], [5, 6]];

console.log("numberClusters is a nested array.");
console.log("The line below access a single element in the nested array.");
console.log(numberClusters[2][1] + " is an element in numberClusters.");

// .indexOf();, .lastIndexOf();, .length;:
console.log("////////////////////////////////////////////////////");
console.log("Array Functions - Indexes:");
console.log("The .indexOf(); function returns the first index of the parameter in the original array.");
console.log("If the element is not found, the function returns -1.");
console.log();

console.log("The .lastIndexOf(); function returns the last index of the parameter in the original array.");
console.log("If the element is not found, the function returns -1.");
console.log();

console.log("The .length; function takes no parameters and returns the number of elements in an array.");
console.log();

console.log("The first index of the letter a is " + fiveLetters.indexOf("a"));
console.log("The last index of the letter a is " + (fiveLetters.length - fiveLetters.reverse().indexOf("a")));
console.log("The there are " + fiveLetters.length + " elements in fiveLetters.");

fiveLetters.reverse();

// .concat();, .join();/.toString();:
console.log("////////////////////////////////////////////////////");
console.log("Array Functions - Concatenation:");
console.log("The .concat(); function takes an array as the parameter and concatenates it to the back of the original array.");
console.log();

console.log("The .join();/.toString(); function takes no parameters and converts all elements into strings and concatenates them together into one long string with elements separated by commas.");
console.log();

let twoLetters = ["e", "f"];

console.log("Concatenating fiveLetters and twoLetters: " + fiveLetters.concat(twoLetters));
console.log("Joining twoLetters and fiveLetters: " + twoLetters.concat(fiveLetters).join());

// .push();, .pop();, .shift();, .unshift();:
console.log("////////////////////////////////////////////////////");
console.log("Array Functions - Adding and Deleting Elements:");
console.log("The .push(); function concatonates the parameters in the order they are entered to back of the original array.");
console.log();

console.log("The .pop(); function takes no parameters and removes the last element in the array.");
console.log();

console.log("The .shift(); function takes no parameters and removes the first element in the array.");
console.log();

console.log("The .unshift(); function shifts the array, then concatenates the parameter to the first element.");
console.log();

fiveLetters.push("g");
console.log("Pushing g to the back of fiveLetters: " + fiveLetters);

fiveLetters.pop();
console.log("Popping g out of the back of fiveLetters: " + fiveLetters);

fiveLetters.unshift("g");
console.log("Adding g from the front of fiveLetters: " + fiveLetters);

fiveLetters.shift();
console.log("Shifting g from the front of fiveLetters: " + fiveLetters);

// .slice();, .reverse();, .splice();:
console.log("////////////////////////////////////////////////////");
console.log("Array Functions - Miscellaneous Manipulation:");
console.log("The .slice(); function takes natural numbers a and b as parameters and returns an array with the elements with indexes from in the interval [a, b).");
console.log();

console.log("The .reverse(); function takes no parameters and returns the reversed order of the original array.");
console.log();

console.log("The .splice(); function inserts, removes, or replaces elements based on the parameters given.")
console.log();

console.log("Slicing fiveLetters from indexes 1 to 4: " + fiveLetters.slice(1, 4));
console.log("Slicing fiveLetters starting at index 1: " + fiveLetters.slice(1));

console.log("Reversing fiveLetters: " + fiveLetters.reverse());

fiveLetters.reverse();

fiveLetters.splice(2, 1, "1", "2", "3");
console.log("Place caret between the elements at indexes 1 and 2 (first parameter), delete 1 element (second parameter), insert the rest of the elements (other parameters): " + fiveLetters);

fiveLetters = ["a", "b", "c", "d", "a"];

// .includes();, .isArray();:
console.log("////////////////////////////////////////////////////");
console.log("Array functions - Checks:");
console.log("The .includes(); function takes the parameter and checks if it is in the original array.");
console.log();

if (fiveLetters.includes("z") == false) {console.log("z is not in fiveLetters.");}

// For some reason the .isArray(); function is not recognized.
/* console.log("The .isArray(); function takes no parameters and checks if the variable is an array.");
console.log();

if (fiveLetters.isArray) {console.log("fiveLetters is an array.");} */



// Loops:
console.log("Loops:")
console.log("----------------------------------------------------");
console.log("The syntax for loops is the same as Java.");
console.log("For example, all three types of loops will count to 10.");
console.log("The break; statement will just exit out of the loop.");

let i;

for (i = 1; i < 10; i++) {}
console.log("For loop: " + i);

i = 1;
while (i < 10) {i++;}
console.log("While loop: " + i);

i = 1;
do {i++;} while (i < 10)
console.log("Do-while loop: " + i);



// Functions:
console.log("Functions:")
console.log("----------------------------------------------------");

const STRING_6 = "This is the format of a function.";
const STRING_7 = "This is another way to write a function, which is called a function expression.";
const STRING_8 = "This is another format of a function expression, which is called an arrow function.";

function outputString1(string) {console.log(string);}
outputString1(string6);

const OUTPUT_STRING_2 = function(string) {console.log(string);}
outputString2(string7);

const OUTPUT_STRING_3 = (string) => {console.log(string);}
outputString3(string8);

console.log("I don't think it matters whether you initialize the function expression with let or const.");
console.log("Here are some other examples of arrow functions with more concise formatting:");

const OUTPUT_STRING_4 = () => {console.log("Functions with no parameters can be formatted like this.");}
outputString4();

const doubleNumber = number => {return 2 * number;}
console.log("If a function only has one parameter, you can omit the parentheses: 2 × 4 = " + doubleNumber(4));

const sumNumbers = (num1, num2) => {return num1 + num2;}
console.log("Functions with at least two parameters must have parentheses: 5 + 6 = " + sumNumbers(5,6));
