/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolsystem;

import java.util.Scanner;

/**
 *
 * @author gta1
 */
public class Prompter extends PersonManager{
    
    public void promptForPerson() {
        String firstName;
        String lastName;
        String fullName = "";
        String email = "";
        Scanner in = new Scanner(System.in);
        boolean done = false;
        while (!done) {
            int answer;
            System.out.print("Please enter the first name of the person ");
            firstName = in.next();
            System.out.print("Please enter the last name of the person ");
            lastName = in.next();
            fullName = firstName + " " + lastName;
            System.out.print("Please enter the email of the person ");
            email = in.next();
            System.out.println("You have now made a new person ready the database with the folowing properties: ");
            System.out.println("Name: " + fullName + " Email: " + email);
            System.out.print("To agree with info and submit please enter 1, otherwise enter 0 to try again: ");
            answer = in.nextInt();
            if (answer == 1) {
                done = true;
            }
        }
        Person newPerson = new Person(1, fullName, email) {
        };
        addPerson(newPerson);

    }
    
}
