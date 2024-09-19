package researchanddev01;

import java.util.Scanner;

public class User {
    // Private fields
    private String name;
    private int age;
    private String hobby;

    // Constructor that accepts name and age
    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.hobby = "Unknown";  // Default value for hobby
    }

    // Constructor that accepts name, age, and hobby
    public User(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for hobby
    public String getHobby() {
        return hobby;
    }

    // Setter for hobby
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    // Method to display name and age
    public void DisplayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Overloaded method to display name, age, and hobby
    public void DisplayInfo(String hobby) {
        this.hobby = hobby;  // Update the hobby field
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hobby: " + hobby);
    }

    // Overloaded method to display years until retirement
    public void DisplayInfo(int yearsLeft) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Years left until retirement: " + yearsLeft);
    }

    // Main method to get user input and display user details
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Ask the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        // Ask the user for their hobby
        System.out.print("Enter your hobby: ");
        String hobby = scanner.nextLine();

        // Calculate years left until retirement
        int retirementAge = 65;
        int yearsLeft = retirementAge - age;

        // Create an instance of the User class
        User user = new User(name, age, hobby);

        // Call DisplayInfo() methods to display the user's details
        System.out.println("\nDisplayInfo() - Name and Age:");
        user.DisplayInfo();  // Displays name and age

        System.out.println("\nDisplayInfo(String hobby) - Name, Age, and Hobby:");
        user.DisplayInfo(hobby);  // Displays name, age, and hobby

        System.out.println("\nDisplayInfo(int yearsLeft) - Years Until Retirement:");
        user.DisplayInfo(yearsLeft);  // Displays years left until retirement

        // Close scanner
        scanner.close();
    }
}
