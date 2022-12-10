package com.careerit.corejava.day4;

public class BreakReturnContinueExample {

  public static void main(String[] args) {

    for (int i = 1; i <= 100; i++) {
      if (i % 3 == 0 && i % 6 == 0) {
        break;
      }
      System.out.print(i+" ");
    }
    System.out.println();
    for (int i = 1; i <= 100; i++) {
      if (i % 3 == 0 && i % 6 == 0) {
        continue;
      }
      System.out.print(i+" ");
    }
  }
  private static boolean isPrime(int num){
        if(num < 2 || (num %2 ==0 && num!=2)){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
              return false;
            }
        }
        return true;
  }
}
