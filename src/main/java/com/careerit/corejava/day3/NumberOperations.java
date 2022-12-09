package com.careerit.corejava.day3;

public class NumberOperations {
  public static void main(String[] args) {
    System.out.println(sumOfDigits(528));
  }
  private static int sumOfDigits(int num){
      int sum = 0;
      while(num !=0){
          sum +=  num % 10;
          num /=  10;
      }
      return sum;
  }
}
