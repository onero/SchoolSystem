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
public class MainMenu extends Menu{

    public MainMenu() {
        super("Awesome Header", "Option 0: Exit", "Option 1: Add Person", "Option 2: Delete Person");
    }

    @Override
    protected void doAction(int option) {
        
        switch (option) {
            case 0:
                System.out.println("Option 0 was selected, goodbye!");
                break;
            case 1:
                System.out.println("Option 1 was selected");
                break;
            case 2:
                System.out.println("Option 2 was selected");
                break;
            default:
                break;
                
        }
        
    }
    
    
}
