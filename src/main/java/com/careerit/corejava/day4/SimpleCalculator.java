package com.careerit.corejava.day4;

import java.util.Scanner;

public class SimpleCalculator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the num1: ");
    int num1 = sc.nextInt();
    System.out.println("Enter teh num2: ");
    int num2 = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter the operator (+,-, /, *, %) :");
    String ope = sc.nextLine();
    int res = 0;
    res = getResultWithSwitchStatement(num1, num2, ope);
    System.out.println(num1 + " " + ope + " " + num2 + " = " + res);

    res = getResultWithSwitchExpression(num1, num2, ope);


  }

  private static int getResultWithSwitchExpression(int num1, int num2, String ope) {
      return switch (ope){
        case "+"-> {
          System.out.println("Sum of two number");
          yield num1 + num2;
        }
        case "-"-> num1 - num2;
        case "*"-> num1 * num2;
        case "/"-> num1 / num2;
        case "%"-> num1 % num2;
        default -> throw new IllegalArgumentException("Invalid operator");
      };
  }

  private static int getResultWithSwitchStatement(int num1, int num2, String ope) {
    int res;
    switch (ope){
      case "+":
        res = num1 + num2;
        break;
      case "-":
        res = num1 - num2;
        break;
      case "*":
        res = num1 * num2;
        break;
      case "/":
        res = num1 / num2;
        break;
      case "%":
        res = num1 % num2;
        break;
      default: throw new IllegalArgumentException("Invalid operator...");

    }
    return res;
  }
}
