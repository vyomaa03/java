package Loops;
import java.util.Scanner;
import java.lang.Math;

public class output_sequence {
    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {
            int n;
            int i;
            int l;
           
    
            System.out.println("Enter an integer:");
            n = scnr.nextInt();
            if (n < 0){
                n = Math.abs(n);
                l = 0 - n;
            } else {
                l = 0 - n;
            }

            System.out.print("Sequence: ");
            
            for(i = l; i < n + 1; i++) {
                System.out.print(i + " ");
            }
         System.out.println();
        }
     }

}
