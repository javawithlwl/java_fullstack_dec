package com.careerit.corejava.day2;

import java.util.Scanner;

public class SimpleInterestCalculator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of p :");
    float p = sc.nextFloat();
    System.out.println("Enter the value of t :");
    float t = sc.nextFloat();
    System.out.println("Enter the value of r :");
    float r = sc.nextFloat();
    float si = (p * t * r)/100;
    System.out.println("The simple interest amount is :"+si);
  }
}
