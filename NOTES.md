# Grader notes

## Note

- Remember to check for NID at top of document
- Remember to check for wonky indentation
- Remember to check for magic numbers

## Line specific errors

- I took off four points because you forgot to include a space after the `if` statement and before the parenthesis. (Line 30)
- I took off four points because you used a block comment. Please use "// inline comments" instead. (Lines 1-7)
- Because you wrote lines of code that exceed 100 characters, I took off four points. Please keep each line of code less than 100 characters long. (Lines 81, 83, and 89)
- Because you a line of code that exceeds 100 characters, I took off four points. Please keep each line of code less than 100 characters long. (Line 10)

## Copy/paste for points off

- I had to take off four points because you included your UCFID instead of your NID (The NID is the one that has the two letters at the beginning, e.g. ab123456)
- Because you used more than three words in end-of-line comments, I had to deduct an additional four points.
- I had to take off four points because you forgot to include your NID in the header comment.
- I had to take off four points because you forgot to include spaces after the "//" in your inline comments. Make sure you “// do this” instead of “//this”. (Line 83)
- I had to take off four points because you forgot to leave a space after your `if`, `for`, and `while` statements. (Lines 17, 18, 21, etc)
- Because you used more than three words in end-of-line comments, I had to deduct an additional four points. (Lines 33, 64, 107)
- I had to take four points off because you forgot to put your curly braces on new lines. (Lines 8, 117, 166, 170)
- I had to take off four points because you forgot to include spaces after the "if" and "for" keywords.
- I had to take four points off because you forgot to put your curly braces on new lines.
- Because you forgot to indent your code one level deeper when starting a new code block, I had to take off four points.
- You received some points off because you weren't consistent with using spaces or tabs. Please choose either spaces or tabs to indent your code.
- Even though your block comment was used to comment out unused code, I had to take off four points for the usage of block comments. Next time, if you have any unused code at the end of the assignment, you should simply delete it.
- Please do not use more than three words on your end-of-line comments. I had to deduct four points because of this.
- Please avoid excessive consecutive blank lines. You should never have more than one or two consecutive blank lines. I had to take four points off because of this.
- Please leave a space on both sides of any binary operators you use in your code (i.e., operators that take two operands). I had to take off four points because of this.
- When defining or calling a method, do not leave a space before its opening parenthesis. For example: use `System.out.println("Hi")` instead of `System.out.println ("Hi")`
- Please use meaningful variable names to convey the meaning of your variables. (The exceptions are using i, j, and k inside of loops and using m and n for the sizes of some inputs)
- Please do not use "var" to declare variables.

## Copy/paste suggestions:

I had to take off points for the following style violations:
Good job on your test cases and style! I had to take points off for your header comment, though:
I took off some points for the following:
While you did good on the test cases, I had to take some points off for style violations:
Other than that, be sure to check out the additional test cases that Szumlanski released so you can see where your code went wrong.
Be sure to check out the test cases that Szumlanski released to see where your code went wrong.
Good job on the test cases!
Good job on the test cases! I had to take some points off for your style, though:
Good job on the styling!
Other than that, great work!
Good job!
Perfect!
P.S. The bonus points you earned brought this assignment back up to a 100.
While your style was mostly good, I had to take some points off for the following:
Other than those style errors, good job on the problem solving. Be sure to fix those things so you can get a 100 on the next assignment!
- Use end-of-line comments sparingly. While I didn't take any points off for it here, you should try using comments on their own line rather than end-of-line comments. If you include any more than three words on end-of-line comments in future assignments, you may receive style points off.
- I didn't take any points off for it, but you forgot to include spaces around the ":" operator in your fancy for loops. In future assignments, make sure to make your fancy for loops are formatted something like "for (int i : myArray)" so you don't receive any future style point deductions.

## Vim regex notes (for writing regular expressions):

See `:help regex` and `help syntax-highlighting`.

For additional resources, see [Learn Vimscript the hard way](https://learnvimscriptthehardway.stevelosh.com/chapters/46.html).

- `\v`    enable very magic mode
- `\m`    enable magic mode
- `\C`    enable case sensitivity
- `\c`    disable case sensitivity
- `%s`    global substitute
- `/`     field separator
- `^`     start of line
- `[]`    character class
- `[^]`   negate contents of character class
- `\(`    start hold pattern
- `\s`    match whitespace
- `*`     0 or more times
- `\)`    end hold pattern
- `\<`    start of word boundary
- `\>`    end of word boundary (prevent returns matching return)
- `.`     match any character
- `\1`    recall hold pattern number 1
- `\2`    recall hold pattern number 2
- `\r`    <CR>
- `\c`    Case insensitive
- `\C`    Case sensitive
- `\|`    Big OR operator
- `g`     Replace all occurrences in the line
