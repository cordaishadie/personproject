package edu.guilford;

import java.util.Random;

public class Person {

    // attributes
    private String name;
    private String gender;
    private int age;
    private double height;
    private double weight;

    //constructors

    // constructor with parameters
    public Person(String name) {
        this.name = name;
    }

    // constructor with all parameters
    public Person(String name, String gender, int age, double height, double weight){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

// constructor with no parameter
    public Person() {
        Random rand = new Random();

        int personName = rand.nextInt(6);
        if (personName == 0) {
            name = "Ryan";
        } else if (personName == 1) {
            name = "Logan";
        } else if (personName == 2) {
            name = "Avery";
        } else if (personName == 3) {
            name = "Riley";
        } else if (personName == 4) {
            name = "Peyton";
        } else {
            name = "Alex";
        }

        boolean personGender = rand.nextBoolean();
        if (personGender == true) {
            gender = "woman";
        } else {
            gender = "man";
        }

        // age with minimum of 18 and maximum of 100
        age = rand.nextInt(82) + 18;

        // weight with minimum of 90 and maximum of 300
        weight = rand.nextInt(210) + 90;
        
        // height with minimum of 48 and maximum of 84
        height = rand.nextInt(36) + 48;
        
    }

    // methods

    public void think() {
        System.out.println("I am thinking");
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void sleep() {
        System.out.println("I am sleeping");
    }

    public void walk() {
        System.out.println("I am walking");
    }

    public void talk() {
        System.out.println("I am talking");
    }

    //helper methods
    public double calculateBMI() {
        // have to multiply by 703 to convert to imperial units
        double bmi = 703 * weight / (height * height);
        return bmi;
    }

    public String getBMIStatus() {
        double bmi = calculateBMI();
        String status = "";
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            status = "Normal";
        } else if (bmi >= 25 && bmi < 30) {
            status = "Overweight";
        } else if (bmi >= 30) {
            status = "Obese";
        }
        return status;
    }

    // getters and setters for all attributes 
    
    public String getGender(){
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString method
    public String toString() {
        String output;

        output = "Name: " + name + "\n"
                + "Gender: " + gender + "\n"
                + "Age: " + age + "\n"
                + "Height(inches): " + height + "\n"
                + "Weight(lbs): " + weight;
        return output;
   }




    
}
