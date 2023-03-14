package main;
import person.Person;
import person.Person.Gender;

/**
 * @author Yang, Yuanhua
 * @version 1.0
 * @since March 26th, 2022
 * PersonMain is the main program for the class Person defined in the package person
 * It will create two Person type objects and display both on the standard ouput.
 * It them compares the two objects with method sameAs and show the result on the standard output.
 */

public class PersonMain {
    
    public static void main(String[] args) {
        Person p1 = new Person(new String("Yang"), new String("Yuanhua"), new String("Student"), Gender.MALE, 22);
        Person p2 = new Person(new String("Yang"), new String("Yuanhua"), new String("Student"), Gender.MALE, 22);

        System.out.println("The data for the two people are as following: ");
        System.out.println(p1);
        System.out.println(p2);

        if (p1.sameAs(p2)) {System.out.println("The two people are the same.");}
        else {System.out.println("The two people are different.");}
    }

}
