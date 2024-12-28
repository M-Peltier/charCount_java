Java program implements a run-length encoding (RLE) algorithm, which compresses strings 
by summarizing consecutive repeating characters. 
Below is a brief breakdown of the code:

Overview
Encoding Logic:
Iterates through the input string.
Counts consecutive occurrences of the same character.
Appends the count followed by the character to a StringBuilder.
Handling Edge Cases:
Returns an empty string for null or empty input.
Interactive CLI:
Allows users to encode strings until they type "exit" to quit the program.
