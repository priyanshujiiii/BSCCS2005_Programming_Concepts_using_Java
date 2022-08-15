// Language 
// STRONGLY typed AND FLEXIBLE 
// object-oriented
// functional compatiable.
// incredibly backward compatible.

// Example
package com.thehecklers;

import java.until.ArrayList;
import java.until.List;

public class Example{
  /* Generics help complier and tools work for you
  Diamond operator <> demonstrates type inference*/
  private final List<Strings> strings= new ArrayList<>();
  private final List<Intgers> Intgers = new ArrayList<>();
  
  public Example(){
    strings.add("Hello there!"); 
    strings.add("why hi"); 
    intgers.add(1);
  }
  
  public void report(){
    System.out.println(strings);
    System.out.println(integers);
  }
}

// Example 2

package com.thehecklers;

public class Example2{
  public void report(){
    // local variable type inference
    var aString ="This is a String";
  
    // Pattern matching
    if (aString instanceof String){
      System.out.println("String variable contains: " + aString);
    }
    else{
      System.out.println("Convert variable contents in string:" + aString.toString());
    }
  }
}

//Example 3

package com.thehecklers;
public class Greeter {
  private String name = "mysterious stranger";
  
  public Greeter(String name){
    if(name.length()>0){
      this.name = name;
    }
  }
  
  public void greet(){
    System.out.printlm("Hi, " + name + "!");
  }
}

// oops java

package com.thehecklers;

public sealed class Rectangle permits Square {
  private final int length,width;
  
  public Rectangle (int length,int width){
    this.length = length;
    this.width = width;
  }
  
  public int getLength(){
    return length;
  }
  
  public int getwidth(){
    return width;
  }
  
  public int calculateArea(){
    return length * width;
  }
  
  public int calculatePerimeter(){
    return (length * width)*2;
  }
}
