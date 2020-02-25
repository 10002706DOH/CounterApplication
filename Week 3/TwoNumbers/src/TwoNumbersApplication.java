
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mo04gw
 */
public class TwoNumbersApplication 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
//        TwoNumbers a = new TwoNumbers(12,18);
//        TwoNumbers b = new TwoNumbers(17,17);
//        
//        System.out.println(a);
//        System.out.println(b);
//        
//        System.out.println("\nSUM - Object a values (12,18) added to those of new object c (8,2): ");
//        TwoNumbers c = new TwoNumbers(8, 2);
//        c = c.addSum(a);
//        System.out.println(c);
//             
//        System.out.println("\nAdd Object - Object b values (17,17) added to those of a (12,18): ");
//        a.addObject(b);
//        System.out.println(a);
//        
//        
//        System.out.println("\nAdd numbers manually to existing object values: ");
//        a.addNumbers();
//        System.out.println(a);
        
        //----------------------------------------------------------------------
        
        //Display menu
        int choice = 0;
        
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the Array of Numbers Manipulator");

        
        System.out.println("\n1 = Specify an array size with 0 values at each position"
                + "\n2 = Make a copy of array"
                + "\n3 = Reset"
                + "\n4 = Make a copy of array"
                + "\n5 = Make a copy of array"
                + "\n6 = Make a copy of array"
                + "\n7 = Make a copy of array"
                + "\n8 = Make a copy of array"
                + "\n9 = Make a copy of array"
                + "\n10 = Make a copy of array"
                + "\n11 = Make a copy of array"
                + "\n12 = Make a copy of array"
                + "\n13 = Make a copy of array");
        
        
        // get choice
        while(choice < 1 || choice > 11)
        {
            System.out.println("Enter your choice (0-11): ");
            if(in.hasNextInt())
            {
                choice = in.nextInt();
            }
            else
            {
                String temp = in.next();
                choice = -1;
            }
            
            ArrayOfNumbers arr1 = new ArrayOfNumbers(0);  
            ArrayOfNumbers arr2 = new ArrayOfNumbers(0);
            // Process menu selection
            switch(choice)
            {
                
                
                // Create an array of zero's to specified size
                case 1:
                    System.out.println("\nSpecify an array size: : ");
                    int arrsize = in.nextInt();
                    in.nextLine();
                    arr1 = new ArrayOfNumbers(arrsize);     
                break;
          
                // Populate the array with values copied from input array
                case 2:
                    System.out.println("\nSelect an array size; ");
                    int thissize = in.nextInt();
                    in.nextLine();
                    arr2 = new ArrayOfNumbers(thissize);
                    int[] thisarray = new int[thissize];
                    for(int x = 0; x < thissize; x++)
                    {
                        System.out.println("\nEnter the array values: ");  
                        thisarray[x] = in.nextInt();
                        in.nextLine();
                    }
                    int[] arrayofints = arr2.ArrayOfNumbers(thisarray);
                    for(int y = 0; y < thissize; y++)
                    {
                        System.out.println((y+1) + " - " + arrayofints[y]);
                    }
                    break;

                // Get the value stored at a specified array position    
                case 3:
                    System.out.println("\nEnter the array position: ");  
                    int pos = in.nextInt();
                    int x = arr2.item(pos);
                    in.nextLine();
                    System.out.println("\nThe value at that position is: " + x);
                    break;
                
                // Change the value at a specified array position
                case 4:
                    System.out.println("\nSet array element value, enter position; ");
                    int a1 = in.nextInt();
                    System.out.println("Enter value: ");
                    int b1 = in.nextInt();
                    arr1.setItem(a1, b1);
                    break;
                
                // Find the highest value in the array
                case 5:
                    System.out.print("\nthe highest array value is; ");
                    int highest =arr1. max();
                    System.out.print(highest);
                    break;
                
                // Check two array positions to see if values are equal
                case 6:
                    loadFromFile(comp2);
                    break;
                
                // Find GCD for two numbers
                case 7:
                    CompIndex(comp2);
                    break;
                
                // Count number of stored array values
                case 8:
                    sortCompetitorsByAge(comp2);
                    break;
                
                // Find total combined value of array values
                case 9:
                    winners(comp2);
                    break;
                
                // find arrayt average value
                case 10:
                    System.out.println("Qualifiers for every event: ");
                    getQualifiers(comp2);
                    break;            
                
                // Multiply all array values by an input integer value
                case 11:
                    System.out.println("Exiting...");
                    
                // Add an input integer value to all array values
                case 12:
                    System.out.println("Exiting...");  
                    
                // Add all of the values of an input array to the stored array values
                case 13:
                    System.out.println("Exiting...");   
                    
            }
            choice = -1;
 
        }

    } 
}
