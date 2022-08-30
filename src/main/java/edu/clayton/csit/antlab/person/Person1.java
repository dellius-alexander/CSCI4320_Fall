package edu.clayton.csit.antlab.person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *  A simple class for person 1
 *  returns their name and a
 *  modified string 
 *  
 *  @author Qu
 *  @version 1.1
 */
public class Person1 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person1(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 1 put your implementation here
		input = input.replaceAll(" ","");
		System.out.printf("\nOriginal: %s\n",input);
		List<String> stringList = new ArrayList<>(
					List.of(input.split(""))
				);
		String container = "";
		for (int i = 2; i < stringList.size(); i++)
		{
			container += stringList.get(i);
		}
		for (int i = 0; i < 2; i++)
		{
			container += stringList.get(i);
		}
	  return container;
	}
	
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}

	public static void main(String[] args) {
		Person1 p1 = new Person1("Dellius Alexander");
		System.out.printf("\nRotated: %s\n",p1.calc("12345678"));
		System.out.printf("\nToString: %s\n",p1.toString("  12345678"));
	}
}
