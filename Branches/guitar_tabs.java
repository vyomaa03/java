package Branches;

/*Write a program that takes a string input representing one of three chords (G, C, D) and outputs the corresponding tab. */

import java.util.Scanner;

public class guitar_tabs {
   public static void main(String[] args) {
      try (Scanner scnr = new Scanner(System.in)) {
        String userChord;
          
          userChord = scnr.next();

          if(userChord.equalsIgnoreCase("G")) {
            System.out.println("e|-3-");
            System.out.println("B|-0-");
            System.out.println("G|-0-");
            System.out.println("D|-0-");
            System.out.println("A|-2-");
            System.out.println("E|-3-");
          } else if(userChord.equalsIgnoreCase("C")) {
            System.out.println("e|-0-");
            System.out.println("B|-1-");
            System.out.println("G|-0-");
            System.out.println("D|-2-");
            System.out.println("A|-3-");
            System.out.println("E|---");
          } else if(userChord.equalsIgnoreCase("D")) {
            System.out.println("e|-2-");
            System.out.println("B|-3-");
            System.out.println("G|-2-");
            System.out.println("D|-0-");
            System.out.println("A|---");
            System.out.println("E|---");
          } else {
            System.out.println(userChord + " is not a supported chord.");
          }
    }
   }
}