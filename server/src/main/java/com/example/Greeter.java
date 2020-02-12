package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * @param someone is the name
   * @return greeting string
   */
  public final String greet(final String someone) {
	  int i =0;
    return String.format("Hello, %s!", someone);
  }
}
