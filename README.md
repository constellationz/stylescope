# Stylescope

`Stylescope` is a collection of Vim highlighters used to identify simple styling errors in Java programs.

Stylescope works by using regular expressions to match certain patterns and highlight them in red. Please note that certain highlights are not always 100% accurate.

## Supported highlights & notes:

- [x] Lowercase class names (Red)
- [x] Curly braces that don't start on their own lines (Red) 
- [x] Block comments (Red)
- [x] Comments without spaces after them (Red) (Fails when // is re-used in comments)
- [x] Lines more than 100 characters long (Red)
- [x] Using var keyword (Red) (Fails when var is used in comment)
- [x] Operators that arent surrounded by spaces (=, +, -, /, \*, :, &&, ||) (Red)
- [x] Operators that arent surrounded by spaces when in square brackets (Green, OK)
- [x] Parenthesis that don't have spaces before certain keywords (if, while, for, synchronized, switch)

## Unsupported highlights

- [ ] 2 consecutive newlines (Should be yellow)
- [ ] 3+ consecutive newlines (Should be red)
- [ ] Bad indentation (Should be red)
- [ ] Leaving a space before a function definition or call (Should be red)

## Note to graders

While Stylescope is a great tool for helping you spot errors, you shouldn't completely rely on it. Regexes for style highlighting will never be 100% accurate, so use your best judgement.

For copy/paste notes, please see `README.md`

## Usage

To enable Stylescope's highlighting, open your source code file in Vim and run the command:

```:so jstylerc```

to enable syntax highlighting for Java source code.

***(Note: jstylerc is for Java source code. There is currently no style highlighting for C source code)***

To reload normal syntax highlighting, simply run

```:syntax off```

and

```:so```

## Attribution

`stylescope` is licensed under the MIT license.
