package Testing;

// @author Forrest Wang
// <Month> <Day>, 2021
// Tutorials
// This Java file contains all the tutorials with the basic coding concepts. Run each method to see how each concept works.

// Import(s):
import java.awt.*;
import java.util.*;
import java.io.*;
import java.text.*;

public class Java_Tutorial {

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should show you how to output data.
     */
    public static void output() {
        // Classes such as System.out.print(); can output data into the console:
        // Everything being outputted is placed inside the round brackets. Text is surrounded with double-quotation marks, and variables are not. Variables and text are separated with a plus sign.
        System.out.print("System.out.print();: The basic way of outputting data.\n");
        System.out.format("System.out.format();: This outputs data, and lets you format it as well.\n");
        System.out.printf("System.out.printf();: This is the same thing as System.out.format();.\n");
        System.out.println("System.out.println();:This outputs data, and starts a new line.");

        // Formatting:
        // Must use the commands System.out.format();, or System.out.printf();
        System.out.format("%-5s %-5s %-5s %-1s", "A", "B", "C", "D\n");
        System.out.format("The negative sign represents the text being left-aligned.\n");
        System.out.format("The \"5s\" represents each String being five spaces apart.");
    }

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should show you how to input data.
     */
    public static void input() {
        // Scanner class:
        // You need the class to input data.
        // Follows the structure Scanner <Scanner Name> = new Scanner(System.in);
        Scanner myScanner = new Scanner(System.in); // This line initializes the Scanner with the name myScanner.

        System.out.println("Enter an integer: ");

        int example = myScanner.nextInt(); // This line assigns the value of a variable to a user input.
        // <Variable> = <Scanner Name>.next<Variable Type>();

        System.out.println("The integer you entered is " + example + ".");

        // Strings are an exception:
        System.out.println("Enter a word: ");

        String word = myScanner.next(); // This reads the next word.

        System.out.println("The word you entered is " + word + ".");
        System.out.println("Enter a sentence: ");

        myScanner.nextLine();
        String sentence = myScanner.nextLine(); // This reads the next line.

        System.out.println("The sentence you entered is " + sentence + ".");

        // Closing the Scanner:
        myScanner.close();

        // Scanner Bug:
        // Occurs when you read integer followed by a string.
        // Solution: after this <Variable> = <Scanner Name>.nextInt();, make a new line and type <Scanner Name>.nextLine;, then type <Variable Name> = <Scanner Name>.nextLine();.
    }

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should show you how variables work.
     */
    public static void variables() {
        // All variables must be initialized with the data type.
        // Coding conventions: Must be in camelCase,
        // Numerical Variables:
        System.out.println("byte: Holds integer values from –2⁷ to 2⁷ - 1, or -128 to 127.");
        System.out.println("short: Holds integer values from -2¹⁵ to 2¹⁵ - 1, or -32,768 to 32,767. (2 bytes, 16 bits)");
        System.out.println("int: Holds integer values from -2³¹ to 2³¹ - 1, or -2,147,483,648 to 2,147,483,647. (4 bytes, 32 bits)");
        System.out.println("long: Holds integer values from -2⁶³ to 2⁶³ - 1, or -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. (8 bytes, 64 bits)");
        System.out.println("float: Holds real numbers from ± 3.40282347 x 1038. (4 bytes, 32 bits)");
        System.out.println("double: Holds real numbers from ± 1.79769313486231570 x 10308. (8 bytes, 64 bits)");

        byte age = 16; // Numbers are not surrounded by anything.

        // Other Variables:
        System.out.println("boolean: True or false. (1 byte, 8 bits)");
        System.out.println("char: One unicode character. (2 bytes, 16 bits)");
        System.out.println("String: Text.");

        char character = 'a'; // Characters are surrounded by single-quotation marks.
        String text = "Text."; // Text is surrounded by double-quotation marks.

        // Constants:
        // Constants are initialized with "final".
        // Coding conventions: Capitalized, words are separated by underscores (_),

        final double TAX_CONSTANT = 1.13;

        // Concatenation:
        // The process of joining values. String statements are concatenated with the + symbol.
        System.out.println();
        System.out.println("I am " + age + " years old.");
    }

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should show you how to perform calculations.
     */
    public static void calculations() {
        // Addition -> +
        // Subtraction -> -
        // Multiplication -> *

        // Division -> /
        // Modulus Division -> %

        // As the numerator and denominator are both integers, the quotient is 0 due to integer division.
        byte integerDivisionExample = 3 / 4;
        System.out.println("3 / 4 = " + integerDivisionExample);

        // As the one of the operands is a decimal, the quotient is 0.75 due to floating point division.
        double floatDivisionExample = 3.0 / 4;
        System.out.println("3.0 / 4 = " + floatDivisionExample);


        // Modulus Division -> %
        // This operation takes the remainder of dividing the numerator by the denominator.
        byte modulusDivisionExample = 5 % 3;
        System.out.println("5 % 3 = " + modulusDivisionExample);


        // Math Class:

        // Follows the structure Math.round(<Variable>); rounds the variable to the nearest integer.
        long roundingExample = Math.round(3.5); // Variable storing the result must be long, or casted.
        System.out.println("Math.round(3.5) = " + roundingExample);

        // Follows the structure Math.sqrt(<Variable>); square roots the variable.
        double squareRootExample = Math.sqrt(9); // Variable storing the result must be double, or casted.
        System.out.println("Math.sqrt(3.5) = " + squareRootExample);

        // Follows the structure Math.pow(<Variable>, <Exponent>); raises the variable to an exponent.
        double powerExample = Math.pow(2, 3); // Variable storing the result must be double, or casted.
        System.out.println("Math.pow(2, 3) = " + powerExample);
    }

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should show you how to use logical statements.
     */
    public static void logic() {
        Scanner myScanner = new Scanner(System.in);
        // Coding conventions:
        // If there is only one statement inside the logical statement, then you can keep it in one line.

        // Variables:
        System.out.println("Enter the value of \"a\": ");
        int a = myScanner.nextInt();
        System.out.println("Enter the value of \"b\": ");
        int b = myScanner.nextInt();

        // If:
        // Follows the structure if (<Condition>) {<Statement(s)>}.
        if (a > 0) {System.out.println("\"a\" is greater than zero.");;}

        // Else-if:
        // Follows the structure else "if (<Condition>) {<Statement(s)>}".
        // If the previous statement executes, the following statements do not execute.
        // Equal signs are replaced with "==" instead.
        else if (a < 0) {System.out.println("\"a\" is less than zero.");;}

        // Else:
        // Follows the structure "else {<Statement(s)>}".
        // If none of the previous statements execute, the else statement executes.
        else {System.out.println("\"a\" is equal to zero.");}

        // Logical Statements:
        // And logic (∧, &) is expressed with "&&".
        // Or logic (∨, |) is expressed with "||".
        // Not logic (¬, !) is expressed with "!".
        if (a > 3 && a < 6) {System.out.println("\"a\" is between three and six.");}
        if (!(a > 3) || !(a < 6)) {System.out.println("\"a\" is not between three and six.");}

        // Switch:
        // Follows the structure "switch (variable) {case 1: <Statement(s)>}".
        // "break;" will stop the switch statement from trying the rest of the statements.
        // Instead of an "else" statement, it is called "default".
        switch (b) {
            case 1 -> System.out.println("\"b\" is equal to 1.");
            case 2 -> System.out.println("\"b\" is equal to 2.");
            default -> System.out.println("\"b\" is not equal to 1, or 2.");
        }

        // Round-off Error:
        // Floating point numbers, such as 0.5, have trouble being converted to binary.
        // Therefore, a condition in a logic statement should never compare these numbers.
    }

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should show you how to generate random numbers.
     */
    public static void randomNumberGenerator() {
        Scanner myScanner = new Scanner(System.in);

        // Random Number Generator class:
        // You need the class to generate random numbers.
        // Follows the structure Random <Random Number Generator Name> = new Random();
        Random rng = new Random(); // This line initializes the Random NUmber Generator with the name rng.

        // If you want a seed, put it inside of the Random(); method.
        Random rng2 = new Random(123456789); // When using a seed, the same sequence of random numbers will be generated each time.

        // Generating random numbers:
        // Follows the structure <Variable> = <Random Number Generator Name>.next<Variable Type>();
        int example = rng.nextInt(); // Generates a random integer.
        System.out.println("Random number with random seed: " + example);

        int example2 = rng2.nextInt();
        System.out.println("Random number with seed 123456789: " + example2);

        // Random numbers in a range:
        System.out.println("Enter the minimum value: ");
        int min = myScanner.nextInt();
        System.out.println("Enter the maximum value: ");
        int max = myScanner.nextInt();
        myScanner.close();

        int example3 = rng.nextInt(max - min + 1) + min; // This is the formula for randomly generating numbers in a range.

        System.out.println("Random number between " + min + " and " + max + " = " + example3);
    }

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should show you how loops work.
     */
    public static void loops() {
        Scanner myScanner = new Scanner(System.in);
        // Coding conventions:
        // If there is only one statement inside the logical statement, then you can keep it in one line.

        // For:
        // Follows the structure "for (<Initialization>; <Condition>; <Increment>) {<Statement(s)>}".
        // Used to execute a set of statements a known number of times:
        System.out.print("Counting from 0 to 9: ");

        for (byte a = 0; a < 10; a++) {System.out.print(a + ", ");}

        System.out.println();

        // While:
        // Follows the structure "while (<Condition>) {<Statement(s)>}".
        // Used to execute a set of statements an unknown number of times:
        byte b = 0;

        System.out.print("Counting even numbers from 0 to 9: ");

        while (b < 9) {
            System.out.print(b + ", ");
            b += 2;
        }

        System.out.println();

        // Do-While:
        // Follows the structure "do {<Statement(s)>} while (<Condition>)".
        // Executes the set of statements at least once.
        // Used for counters.
        final byte SENTINEL = 0;

        long input;
        long sum = 0;
        long iterations = -1;

        do {
            System.out.println("Enter the number to be summed (0 to quit):");
            input = myScanner.nextLong();
            sum += input;
            iterations++;
            System.out.println("Sum = " + sum);
        } while (input != SENTINEL);

        System.out.println("You added " + iterations + " integers.");

        // Counters:
        // Count and sum values.
        // Example: A calculator for summing values.

        // Accumulators:
        // Accumulate the number of iterations.
        // Example: Counting the number of times something has been entered.

        // Memory Overflow:
        // This error occurs when a variable can no longer store a number due a lack of memory.
        // Solution: Change the data type to a larger one.
    }

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should show you how to manipulate strings.
     */
    public static void strings() {
        Scanner myScanner = new Scanner(System.in);

        // String Methods:

        // length(); returns the number of characters in the string.
        // substring(int start, int end); returns a part of the string starting at "start" and ending one character before "end".
        // substring(int start); returns a part of the string starting at "start" all the way to the end of the string.
        // toLowerCase(); returns the string in lowercase.
        // toUpperCase(); returns the string in uppercase.
        // trim(); returns the string without any spaces.
        // replaceFirst(String str1, String str2); returns a string with the first occurrence of "str1" replaced with "str2".
        // replaceAll(String str1, String str2); returns a string with all occurrences of "str1" replaced with "str2".

        System.out.println("Enter which method you want to run: ");
        System.out.println("1. length();");
        System.out.println("2. toLowerCase();");
        System.out.println("3. toUpperCase();");
        System.out.println("4. trim();");

        byte choice = myScanner.nextByte();
        myScanner.nextLine();
        String str;

        switch (choice) {
            case 1 -> {
                // Variables:
                System.out.println("Enter a string: ");
                str = myScanner.nextLine();

                // Output:
                System.out.println("The sentence \"" + str + "\" is " + str.length() + " character(s) long.");
            }
            case 2 -> {
                // Variables:
                System.out.println("Enter a string: ");
                str = myScanner.nextLine();

                // Output:
                System.out.println("In lowercase: " + str.toLowerCase());
            }
            case 3 -> {
                // Variables:
                System.out.println("Enter a string: ");
                str = myScanner.nextLine();

                // Output:
                System.out.println("In uppercase: " + str.toUpperCase());
            }
            case 4 -> {
                // Variables:
                System.out.println("Enter a string: ");
                str = myScanner.nextLine();

                // Output:
                System.out.println("Trimmed: " + str.trim());
            }
        }

        // For comparing strings:

        // equals(String str); returns true if both strings are the same; it is case-sensitive.
        // equalsIgnoreCase(String str); same as equals(String str);, but it is not case-sensitive.
        // compareTo(String str); returns 0 if both strings are the same, returns a negative integer if "str" comes alphabetically after the string, returns a positive integer if "str" comes alphabetically after the string; it is case-sensitive.
        // compareToIgnoreCase(String str); same as compareTo(String str);, but it is not case-sensitive.
        // indexOf(String str); returns the index of the first occurrence of "str"; it returns -1 if "str" cannot be found.
        // lastIndexOf(String str); returns the index of the last occurrence of "str"; returns -1 if "str" cannot be found.
        // startsWith(String str); returns true if the string begins with "str".
        // endsWith(String str); returns true if the string ends with "str".

        System.out.println();

        System.out.println("Enter which method you want to run: ");
        System.out.println("1. equals(String str);");
        System.out.println("2. equalsIgnoreCase(String str);");
        System.out.println("3. indexOf(String str);");
        System.out.println("4. lastIndexOf(String str);");
        System.out.println("5. startsWith(String str);");
        System.out.println("6. endsWith(String str);");

        choice = myScanner.nextByte();
        myScanner.nextLine();
        String example = "Abcd";

        switch (choice) {
            case 1 -> {
                // Variables:
                System.out.println("The sentence is \"Abcd\".");
                System.out.println("Enter a string: ");
                str = myScanner.nextLine();

                // Output:
                if (str.equals(example)) {System.out.println("Both strings are the same including capitalization.");}

                else {System.out.println("Both strings are different.");}
            }
            case 2 -> {
                // Variables:
                System.out.println("The sentence is \"Abcd\".");
                System.out.println("Enter a string: ");
                str = myScanner.nextLine();

                // Output:
                if (str.equalsIgnoreCase(example)) {System.out.println("Both strings are the same excluding capitalization.");}

                else {System.out.println("Both strings are different.");}
            }
            case 3 -> {
                // Variables:
                System.out.println("The sentence is \"Abcd\".");
                System.out.println("Enter a string: ");
                str = myScanner.nextLine();

                // Output:
                System.out.println("The first index of \"" + str + "\" is " + example.indexOf(str) + ".");
            }
            case 4 -> {
                // Variables:
                System.out.println("The sentence is \"Abcd\".");
                System.out.println("Enter a string: ");
                str = myScanner.nextLine();

                // Output:
                System.out.println("The last index of \"" + str + "\" is " + example.lastIndexOf(str) + ".");
            }
            case 5 -> {
                // Variables:
                System.out.println("The sentence is \"Abcd\".");
                System.out.println("Enter a string: ");
                str = myScanner.nextLine();

                // Output:
                if (example.startsWith(str)) {System.out.println("\"Abcd\" starts with \"" + str + "\".");}

                else {System.out.println("\"Abcd\" does not start with \"" + str + "\".");}
            }
            case 6 -> {
                // Variables:
                System.out.println("The sentence is \"Abcd\".");
                System.out.println("Enter a string: ");
                str = myScanner.nextLine();

                // Output:
                if (example.endsWith(str)) {System.out.println("\"Abcd\" ends with \"" + str + "\".");}

                else {System.out.println("\"Abcd\" does not end with \"" + str + "\".");}
            }
        }

        // Index:
        // The position of a character in a string, represented by an integer.
        // The first character is always represented by 0, followed by 1, 2, ...
    }

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should show you how to use methods.
     */
    public static void methods() {
        System.out.println("Open the method and read the information inside.");

        // Coding Conventions:
        // Use camel-casing.

        // Writing methods:
        // Follows the structure <Access Level> <Return Type> <Method Name>(<Parameters>) {
        //     <Statement(s)>
        // }.
        // Method Declaration - The access level, return type, name, and parameters if any.
        // Method Body - The statement(s).
        // Access Level - Determines if other classes can call the method.
        // Return Type - Determines if the method will return a value.
        // Public - Means that other classes can call this method.
        // Static - Means that the method a class method.
        // Void - Means that the method will not return a value.

        // Method Parameters:
        // Using arguments to pass data to a method.
        // Follows the structure (<Variable Type> <Variable Name>)
        // The values of the variables can now be used in the method.
        // When using multiple parameters, separate each one with a comma and a space.

        // Method Overloading:
        // As long as the parameters for methods are different, methods can have the same names.

        // Return Statement:
        // Follows the structure return(<Variable Name>);.
        // Calls the method within the method, returning only one value.
        // The type of variable that is being returned must be mentioned in the return type (byte, int, long, float, double, boolean, char, String).
        // If there is no return statement, the return type is void.

        // Documenting Methods:
        // Comment out the pre-condition, and post-condition of each method.

        /**
         * Pre-condition: What is required for the method to run.
         * Post-condition: What the method should do.
         */

        // Use camel-casing when naming methods.
    }

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should show you how to use arrays.
     */
    public static void arrays() {
        // Arrays:
        // Stores the same kind of data together.
        // Must first declare the array, and allocate space for it.

        // Declaration:
        // Follows the structure [Variable Type][] [Array Name];.
        byte[] perfectSquares;

        // Allocation:
        // Follows the structure [Array Name] = new [Variable Type][Number of variables stored];.
        perfectSquares = new byte[11];

        // Initialization:
        // Follows the structure [Variable Type][] [Array Name] = {[Variable Values]};.
        byte[] perfectCubes = {1, 8, 27, 64};

        // You can declare and allocate or initialize arrays on one line.

        // Using arrays:

        // Accessing an element:
        // Follows the structure [Array Name][Index].
        // The index of the first element is always 0.
        System.out.println("The first perfect cube: " + perfectCubes[0]);

        // Array length:
        // Follows the structure [Array Name].length;.
        System.out.println("The perfectCubes array is " + perfectCubes.length + " elements long.");

        // Traversing:
        // Uses a for-loop to traverse an entire array:
        // Follows the structure for (<Variable Type> element : <Array Name>) {<Statement(s)>}
        System.out.print("Perfect cubes from 1 to 4: ");

        for (byte element : perfectCubes) {System.out.print(element + ", ");}

        // Array Index Out of Bounds:
        // Occurs when an invalid index is used.
    }

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should show you how to use fileWriter.
     */
    public static void writingTextFiles() {
        // When using File Writer and Buffered Writer, always surround the statement(s) in try{ }.
        // The method with the File Writer and Buffered Writer must end with throws IOException.
        try {
            // Initializing the File Writer:
            // Follows the structure FileWriter <File Writer Name> = new FileWriter("<Text File Name>");
            FileWriter writer = new FileWriter("Temporary.txt");

            // Initializing the Buffered Writer:
            // Follows the structure BufferedWriter <Buffered Writer Name> = new BufferedWriter(writer);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            // Writing to Text Files:
            // Use the class bufferedWriter.write(); to write to text files.
            // Use bufferedWriter.newLine(); to begin a new line.
            bufferedWriter.write("This is a temporary text file.");
            bufferedWriter.newLine();
            bufferedWriter.write("You may safely delete this.");

            // Closing the File Writer:
            writer.close();

            // Closing the Buffered Writer:
            bufferedWriter.close();
        }

        // Also have this line to catch any exceptions:
        catch (IOException e) {e.printStackTrace();}
    }

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should show you how to use bufferedReader.
     */
    public static void readingTextFiles() {
        // When using File Reader and Buffered Reader, always surround the statement(s) in try{ }.
        // The method with the File Reader and Buffered Reader must end with throws IOException.
        try {
            // Initializing the File Reader:
            // Follows the structure FileReader <File Reader Name> = new FileReader("<Text File Name>");
            FileReader reader = new FileReader("Temporary.txt");

            // Initializing the Buffered Reader:
            // Follows the structure BufferedReader <Buffered Reader Name> = new BufferedReader(reader);
            BufferedReader bufferedReader = new BufferedReader(reader);

            // Reading Text Files:
            // Use the class bufferedReader.readLine(); to read a line from a text file.
            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());

            // Closing the File Reader:
            reader.close();

            // Closing the Buffered Reader:
            bufferedReader.close();
        }

        // Also have this line to catch any exceptions:
        catch (IOException e) {e.printStackTrace();}
    }

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should show you how coding conventions work.
     */
    public static void codingConventions() {
        System.out.println("Open the method and read the information inside.");

        // General Rules:
        // Comment EVERYTHING.
        // At the beginning of each Java project, comment out the author using @author <Name>, date using <Month> <Day>, <Year>, project name, and project description.
        // Try to minimize the memory used by using the smallest variable type.

        // Documenting:
        // These are single line comments.

        /*
         * These are block comments.
         */

        /**
         * This is a Javadoc.
         */


        // Camel-casing:
        // The first word is in lower-case, and the rest of the words start capitalized.
        // Words are not separated.

        // Variable Names:
        // Use full words.
        // Only use letters and numbers.
        // Use camel-casing.

        // Constant Names:
        // Use full words.
        // Only use letters and numbers.
        // Must be uppercase.
        // Words are separated with underscores (_).

        // Logical statements and Loops:
        // If there is only one statement inside the logical statement or loop, then you can keep it in one line.

        // Methods:
        // Comment out the pre-condition, and post-condition of each method.

        /**
         * Pre-condition: What is required for the method to run.
         * Post-condition: What the method should do.
         */

        // Use camel-casing when naming methods.
    }

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should show you some miscellaneous information.
     */
    public static void miscellaneous() {
        System.out.println("Open the method and read the information inside.");

        // Template.java is a basic layout of a java project, so use it everytime you make a new file.
        // Remember to change the package, program name, and comments.

        // Texting.java is used for testing java concepts. Remember to revert it back to its original state, which is found in testing.copy.

        // Imports:
        // Follows the structure import <Package>;
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variable(s):
        System.out.println("Enter which method you want to run: ");
        System.out.println("1. output();");
        System.out.println("2. input();");
        System.out.println("3. variables();");
        System.out.println("4. calculations();");
        System.out.println("5. logic();");
        System.out.println("6. randomNumberGenerator();");
        System.out.println("7. loops();");
        System.out.println("8. strings()");
        System.out.println("9. methods();");
        System.out.println("10. arrays();");
        System.out.println("11. writingTextFiles();");
        System.out.println("12. readingTextFiles();");
        System.out.println("13. codingConventions();");
        System.out.println("14. miscellaneous();");

        byte choice = myScanner.nextByte();

        switch (choice) {
            case 1 -> output();
            case 2 -> input();
            case 3 -> variables();
            case 4 -> calculations();
            case 5 -> logic();
            case 6 -> randomNumberGenerator();
            case 7 -> loops();
            case 8 -> strings();
            case 9 -> methods();
            case 10 -> arrays();
            case 11 -> writingTextFiles();
            case 12 -> readingTextFiles();
            case 13 -> codingConventions();
            case 14 -> miscellaneous();
        }
    }
}