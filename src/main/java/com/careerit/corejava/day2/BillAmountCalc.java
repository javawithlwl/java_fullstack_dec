package com.careerit.corejava.day2;

import java.util.Scanner;

public interface BillAmountCalc {
  public static void main(String[] args) {
    float discount = 0;
    float netAmount = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the bill amount :");
    float billAmount = sc.nextFloat();
    if(billAmount > 5000){
        discount = billAmount * 10 / 100;
    }
    netAmount = billAmount - discount;
    System.out.println("Bill amount :"+billAmount);
    System.out.println("Discount    :"+discount);
    System.out.println("Net amount  :"+netAmount);
  }

}
