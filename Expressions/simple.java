/* Write an assignment statement for the following mathematical equation:
    y = (1/3)x + (x/4) + 2x */

import java.util.Scanner; 

public class simple {
    public static void main(String[] args) {
       try (Scanner scnr = new Scanner(System.in)) {
        int x; 
           double y; 
           
           x = scnr.nextInt(); 
           
           y = (1.0/3.0) * x + (x/4.0) + (2 * x);
           
           System.out.println(y);
    } 
    }
 }
