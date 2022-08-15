// Prototype your Java with Jshell

//What is  Jshell ?
// command line tool
// Part of the java Development kit(JDK)

// WHY IS IT USEFUL?
// A read , Evaluate, Print loop for java.
// Great for exploring new language features.
// Designed to give extremely rapid feedback step.
// It's like working withe Play-Deh(TH).

//How was it developed
// 21 years after the relase of java 1.0 there was enough momentum
// from the community create a core JDK feature at learning java.
// # JEP-222: https://openjdk.javanet/jeps/222

//foundation concepts.
//snippet: a unit of input in Jshell
//Thee kinds of snippets . No need to type closing ";"
// expression
// statement
// declaration
// non - nested
// nested

//1. Declartion https://github.com/omiprof/JCP_EC_Eduction_WG_Presentation/blob/master/JShellDemCode.txt
//Declaration are either nested , or non-nested. If non-nested,there are some special rules.
  //Access modifiers ('public',private',etc) are ignored.
  // all declartion snippets are accessible to all other snippets.
    //'final' is ignored 
    //'static' is ignored
    //'default' and synchronized are not allowed
    //'abstract' is only alllowed on classes.
// nested declarations follow normal java rules.

// Kinds of declartions
// 'import'
// 'method'
// 'class'
// 'fiels'
// 'interfaces'


// 'import'
//... java
//import java.util.Scanner;
//imports


// method 
//... java
// public void loan(){
