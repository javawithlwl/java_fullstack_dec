package com.careerit.corejava.day3;

import java.util.Scanner;

public class GenerateFirstNEvenNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of N:");
    int n = sc.nextInt();
    int count = 0;
    for (int i = 2; ; i = i + 2) {
      System.out.print(i+" ");
      count++;
      if(count == n){
          break;
      }

    }
  }
}
