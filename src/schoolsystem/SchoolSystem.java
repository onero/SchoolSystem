/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolsystem;

/**
 *
 * @author gta1
 */
public class SchoolSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonTester personTester = new PersonTester();
        MainMenu menu = new MainMenu();
        personTester.testPersons();
        menu.run();
        
        
    }
    
}
