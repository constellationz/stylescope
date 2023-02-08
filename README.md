# Stylescope

`Stylescope` is a collection of scripts used to grade assignments.

## Depends on:

- `nvim`
- `fzf`

## Usage

1. Before working on any assignments, make sure to run `rmgit` to unlink the repository from Git and turn it into a regular directory.

2. To start grading, place assignment reports in `reports` and assignment submissions in `submissions`.

3. Then, run `bash scripts/g` to go into grading mode. You type in the name of the assignment and it is opened in a split Neovim window.

## Features

- To navigate between the files, use `<Shift>J` and `<Shift>L`

- To enable error highlighting, press `S`. To disable it, press `s`.

- To jump to the score earned on test cases, press `t`.

- To jump to style violations, press `v`

- To quit and search for the next student, press `q`

## Supported error highlights:

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
- [ ] i++ and i-- incorrectly highlights

## Attribution

`stylescope` is licensed under the MIT license.
