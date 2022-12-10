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
  private static int reverse(int num){
      int rev = 0;
      while(num!=0){
          int r = num % 10;
          rev = rev * 10 + r;
          num /= 10;
      }
      return rev;
  }
  private static boolean isPalindrome(int num){
        return num == reverse(num);
  }
  private static int sumOfDigitsUntilSumGetSingleDigit(int num){
      //Example: 9819 => 9
    return 0;
  }
  private static int checkArmstrong(int num){
      // Example: 153  => 1^3 + 5^3 + 3^3
    return 0;
  }
  private static void showFirstNArmstrongNumbers(int n){
      // Example: n = 5 => 1,153
  }
}
