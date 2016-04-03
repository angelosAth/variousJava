
package singlelinkedlist;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class SingleLinkedList {
    
    
 
    public static void main(String[] args) {
        
        LinkedList lList = new LinkedList();
         
        Scanner scanner = new Scanner(System.in);
       
        while(true){
            try {
                System.out.println("\n Choose a list operation");
                System.out.println("-------------------------");
                System.out.println("1. Display the list ");
                System.out.println("2. Insert an integer to the list ");
                System.out.println("3. Remove the integer at the"
                        + " beginning of the list ");
                System.out.println("4. Remove after chosen element ");
                System.out.println("5. Insert after chosen element");
                System.out.println("6. Quit ");
                
                
                int choice = scanner.nextInt();
           
                switch (choice) {
                    case 1:
                        lList.display();         
                    break;
                    case 2:
                        System.out.println("Insert integer :");
                        int choiceData = scanner.nextInt();
                        lList.insertBeginning(choiceData);
                        System.out.println(choiceData + " has been inserted at the"
                                + "beginning of the list");
                    break;
                    case 3:
                        lList.removeBeginning();
                    break;
                    case 4: 
                        System.out.println("Insert the element :");
                        choiceData = scanner.nextInt();
                        lList.removeAfter(choiceData);
                    break;
                    case 5:
                        System.out.println("Type the integer you want to put : ");
                        choiceData = scanner.nextInt();
                        System.out.println("After which element :");
                        int data = scanner.nextInt();
                        lList.insertAfter(data, choiceData);
                    break;
                    case 6:
                        // quit
                        return;
                    default:
                        System.out.println("Please put a number from 1 to 4");       
                }
            
            } catch (InputMismatchException e) {
                System.out.println("Invalid value!");
                // to consume the invalid value
                scanner.next();  
            } 
        }       
    }
}
