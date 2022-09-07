package edu.clayton.csit.antlab.person;
import java.util.*;

/**
 *  A simple class for person 4
 *  returns their name and a
 *  modified string 
 *  
 *  @author Qu
 *  @version 1.1
 */
public class Person4 {
  /** Holds the persons real name */
  private String name;
    /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */
  public Person4(String Makieron) {
    name = Makieron;
  }
    /**
     * This method should return a string
     * where each character is 1 greater 
     * than its previous value.  So
     * given "abc123" it should return
     * "bcd234".
     *
     * @param input the string to be modified
     * @return the modified string
     */
   /* private String calc(String input) {
        String str = "input";
          String strIncremented = new String();
        for (int i = 0; i < str.length();i++){
          strIncremented+=(char)(str.charAt(i)+1);
        }
        System.out.println(strIncremented);
      return null;
    }*/
  static String updateStr(String S, String N)
{
    String t = "";
    for (int i = 0; i < S.length(); i++) {

 

    // Get ASCII value
    int a = (int)(N.charAt(i) - '0');
    int b = (int)(S.charAt(i) + a);

 

    if (b > 122)
        b -= 26;

 

    char x = (char)b;
    t +=x;
    }
    return t;
}


// Driver code
public static void main(String args[])
{
    String S = "Makieron";
    String N = "1106610510283112111";
    System.out.println(updateStr(S, N));
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
      return null;
    }

}


