package com.careerit.corejava.day4;

public class ArrayExample1 {
  public static void main(String[] args) {

    int[] arr = new int[]{1, 2, 3, 4, 5};
    System.out.println(arr.length);
    System.out.println(arr[0]);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.print(arr[i] + " ");
    }

  }
}
