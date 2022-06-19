// package basics;

import java.util.Scanner;

public class input {

    public static void main(String[] a) {
        // to take input we have scanner class

        /*
         * ----------> Type of Input method <-----------------
         * to input byte variable
         * --> object_name.nextByte(); // to take byte input
         * --> object_name.nextFloat(); //to take float
         * --> object_name.nextInt(); //to take int
         * --> object_name.next(); //to take String without white space
         * --> object_name.nextLine(); //to take String with white space
         * 
         * object name is user defined
         */

        
        Scanner scanner = new Scanner(System.in); // system.in mean that we take input from the terminal
        System.out.println("Enter an age : ");
        byte x = scanner.nextByte();
        System.out.println("age : " + x);
        
        Scanner s = new Scanner(System.in); // system.in mean that we take input from the terminal
        System.out.println("Enter a Name : ");
        String p=s.nextLine();
        System.out.println("Name : "+p);
        
        
        Scanner z=new Scanner(System.in);
        System.out.print("Enter a Surname : ");
        String k=z.nextLine();
        System.out.print("Your Surname is :"+k);
        
        //we have to close scanner class object we done at last because after close it not take input
        scanner.close();
        z.close();
        s.close();

    }  

}
