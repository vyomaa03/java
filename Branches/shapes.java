package Branches;

import java.util.Scanner;

public class shapes {
    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {
            
            String shape = scnr.next();

            if(shape.equalsIgnoreCase("square")){
                System.out.println("***");
                System.out.println("* *");
                System.out.println("***");
            } else if(shape.equalsIgnoreCase("triangle")){
                System.out.println("  *");
                System.out.println(" * *");
                System.out.println("*****");

            }
        }
     } 
}
