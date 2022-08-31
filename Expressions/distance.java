/* Map/GPS applications commonly compute the distance between two points. 
A point may be a coordinate on an x-y plane like 1.5 2.0. 
The distance formula is d = √((x2 - x1)2 + (y2-y1)2) (basically, Pythagorean's Theorem). 
Given two points, output the distance between them. 
If the input is 1.5 2.0 4.5 6.0, the output is 5. */

import java.util.Scanner;
import java.lang.Math;

public class distance {
   public static void main(String[] args) {
      try (Scanner scnr = new Scanner(System.in)) {
         double x1 = scnr.nextDouble();
         double y1 = scnr.nextDouble();

         double x2 = scnr.nextDouble();
         double y2 = scnr.nextDouble();

         double distance = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));

         System.out.println(distance);
      }
   }
}