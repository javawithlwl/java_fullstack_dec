package com.careerit.corejava.day4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGame {
  public static void main(String[] args) {
    int rnum = ThreadLocalRandom.current().nextInt(1, 7);
    Scanner sc = new Scanner(System.in);
    for (int i = 1; i <= 3; i++) {
      System.out.println("Guess a number in range (1-6) :");
      int gnum = sc.nextInt();
      if (rnum == gnum) {
        System.out.println("You guessed number, Congratulations");
      } else {
        if (i == 3) {
          System.out.println("Wrong guess, you have reached max no of attempts");
        } else {
          System.out.println("Wrong guess, try again");
        }
      }
    }
  }
}
