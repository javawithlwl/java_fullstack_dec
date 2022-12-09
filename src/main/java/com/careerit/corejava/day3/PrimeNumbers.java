package com.careerit.corejava.day3;

import java.util.Scanner;

public class PrimeNumbers {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number :");
    int num = sc.nextInt();
    boolean isPrime = true;
    for (int i = 2; i <= num/2; i++) {
      if (num % i == 0) {
        isPrime = false;
        break;
      }
    }
    if (isPrime) {
      System.out.println(num + " is prime");
    } else {
      System.out.println(num + " is not prime");
    }

  }
}
