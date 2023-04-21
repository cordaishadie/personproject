package edu.guilford;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        // create a new person object
        Person person1 = new Person();
        person1.setName("John");
        System.out.println(person1.getName());

        // create a new person object
        Person person2 = new Person("Jane");
        System.out.println(person2.getName());

        // create a new person object and print out all the attributes
        Person person3 = new Person("Cordai", "woman", 18, 63, 125);
        System.out.println(person3.toString());
        System.out.println(person3.calculateBMI());
        System.out.println(person3.getBMIStatus());

        ArrayList<Person> people = new ArrayList<Person>();
        // add people to the array list
        people.add(person1);
        people.add(person2);
        people.add(person3);

        // loop that instantiates 5 people objects and adds them to the array list
        for (int i = 0; i < 5; i++) {
            people.add(new Person());
        }

        // loop that prints out the name of each person in the array list
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).getName());
        }

        //analyze the array list
        System.out.println(people.size());



    }
}
