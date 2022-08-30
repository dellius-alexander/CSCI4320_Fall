package edu.clayton.csit.antlab.person;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Qu
 * @version 1.1
 */
public class Person2 {
	/** Holds the persons real name */
	private String name;
	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	public Person2(String pname) {
		name = pname;
	}
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
		List<String> inputs = new ArrayList<>(List.of(input.split("")));
		String outputs = "";
//		System.out.printf(inputs.toString());
		Random rand = new Random();
		while(!inputs.isEmpty()){
			int val = rand.nextInt(inputs.size());
			outputs += inputs.get(val);
			inputs.remove(val);
		}
//		System.out.printf("\nRandom String: %s\n",outputs);
		//Person 2 put your implementation here
		return outputs;
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
		Person2 p = new Person2("AnnMarie");
		p.calc("AnnMarie");
		System.out.printf("%s",p.toString("Whitley"));
	}
}