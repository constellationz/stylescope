# Grader notes

## Copy/paste for points off

- I had to take off four points because you forgot to include spaces after the "if" and "for" keywords.
- I had to take four points off because you forgot to put your curly braces on new lines.
- Because you forgot to indent your code one level deeper when starting a new code block, I had to take off four points.
- You received some points off because you weren't consistent with using spaces or tabs. Please choose either spaces or tabs to indent your code.
- I had to take off four points because you used block comments. Please use "// inline comments" instead.
- Even though your block comment was used to comment out unused code, I had to take off four points for the usage of block comments. Next time, if you have any unused code at the end of the assignment, you should simply delete it.
- Always include a space after the “//” in your comments: “// Do this” instead of “//this”.
- Please do not write excessively long lines of code. Lines must be no longer than 100 characters wide. I had to take four points off because of this.
- Please do not use more than three words on your end-of-line comments. I had to deduct four points because of this.
- Please avoid excessive consecutive blank lines. You should never have more than one or two consecutive blank lines. I had to take four points off because of this.
- Please leave a space on both sides of any binary operators you use in your code (i.e., operators that take two operands). I had to take off four points because of this.
- When defining or calling a method, do not leave a space before its opening parenthesis. For example: use `System.out.println("Hi")` instead of `System.out.println ("Hi")`
- Please use meaningful variable names to convey the meaning of your variables. (The exceptions are using i, j, and k inside of loops and using m and n for the sizes of some inputs)
- Please do not use "var" to declare variables.

## Copy/paste for suggestions:

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
