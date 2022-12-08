package com.careerit.corejava.day2;

import java.util.Scanner;

public class RequiredCabs {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no of people :");
    int count = sc.nextInt();
    System.out.println("Enter the capacity      :");
    int capacity = sc.nextInt();
    int requiredCabs=0;
    if(count % capacity == 0){
        requiredCabs = count / capacity;
    }else{
      requiredCabs = (count / capacity) + 1;
    }
    System.out.println("People count :"+count+" cab capacity :"+capacity+" and required cab is :"+requiredCabs);

  }
}
