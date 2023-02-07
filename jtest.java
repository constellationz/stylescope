// Lowercase class name (Bad)
class lowercaseClassName
 class lowercaseClassName
	class lowercaseClassName

// Curly braces that doen't start on a new line (Bad)
public static void main(String [] args) {
 public static void main(String [] args) {
	public static void main(String [] args) {
asdf{
 asdf{
	asdf{
if (){
for (){
while (){
if () {
for () {
while () {
 if (){
 for (){
 while (){
	if () {
	for () {
	while () {

// Block comments (Bad)
/* I am a block comment! */
 /* I am a block comment! */
	/* I am a block comment! */
/*
 * I am also a block comment!
 */
 /*
  * I am also a block comment!
  */
	/*
 	* I am also a block comment!
 	*/

// Comments without spaces after the "//" (Bad)
//I have no spaces after the slashes!
//I also have no spaces after the slashes

// End of line comments (Warn)
System.out.println(); // Short EOL comment
System.out.println(); // I am long a end of line comment
System.out.println();//I am an end of line comment
System.out.println()// I am a weirdly formatted end of line comment
;

// Line that's more than 100 characters long (Bad)
System.out.println("I swear, this print statement is super meaningful. It really does add a lot of value to this program.");
// This comment is really useful. I need a comment this long because it describes what's going on in my program. Surely it won't result in points off.

// TODO: Excessive blank lines
// one

// two


// three



// four




// Using var to declare stuff
var myVar = 10;
varmyVarNotAnError = 10;
 var myVar = 10;
 varmyVarNotAnError = 10;
 	var myVar = 10;
	varmyVarNotAnError = 10;

// Operators that aren't surrounded by spaces
int a=1
a||a
a&&a
true||true
true&&true
1+1
1-1
1/1
1*1
int a:array
a+b
a-b
a/b
a*b
 int a=1
 a||a
 a&&a
 true||true
 true&&true
 1+1
 1-1
 1/1
 1*1
 int a:array
 a+b
 a-b
 a/b
 a*b
	a||a
	a&&a
	true||true
	true&&true
	int a=1
	1+1
	1-1
	1/1
	1*1
	int a:array
	a+b
	a-b
	a/b
	a*b

// Operators that are surrounded by spaces (Should have no warning)
int a = 1
a || a
a && a
true || true
true && true
1 + 1
1 - 1
1 / 1
1 * 1
a + a
a - a
a / a
a * a
int a : array
 int a = 1
 a || a
 a && a
 true || true
 true && true
 1 + 1
 1 - 1
 1 / 1
 1 * 1
 a + a
 a - a
 a / a
 a * a
 int a : array
	int a = 1
	a || a
	a && a
	true || true
	true && true
	1 + 1
	1 - 1
	1 / 1
	1 * 1
	a + a
	a - a
	a / a
	a * a
	int a : array

// Parenthesis that don't have spaces before certain keywords
if(expression)
{
}
while(expression)
{
}
for(control)
{
}
synchronized(expression)
switch(expression)
{
}
 if(expression)
 {
 }
 while(expression)
 {
 }
 for(control)
 {
 }
 synchronized(expression)
 switch(expression)
 {
 }
	if(expression)
	{
	}
	while(expression)
	{
	}
	for(control)
	{
	}
	synchronized(expression)
	switch(expression)
	{
	}
