package com.careerit.corejava.day4;

public class NoDaysInGivenMonthUsingSwitch {
  public static void main(String[] args) {
    System.out.println(noOfDaysUsingSwitchStatement(2, 2022));
    System.out.println(noOfDaysUsingSwitchStatement(2, 2020));
  }

  private static int noOfDaysUsingSwitchStatement(int month, int year) {
    int days = 0;
    switch (month) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        days = 31;
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        days = 30;
        break;
      case 2:
        days = checkAndGetNoOfDays(year);
        break;
      default:
        throw new IllegalArgumentException("Invalid month");
    }
    return days;
  }

  private static int noOfDaysUsingSwitchExp(int month, int year) {
    int days = switch (month) {
      case 1, 3, 5, 7, 8, 10, 12 -> 31;
      case 4, 6, 9, 11 -> 30;
      case 2 -> {
        days = checkAndGetNoOfDays(year);
        yield days;
      }
      default -> throw new IllegalArgumentException("Invalid month");
    };
    return days;
  }

  private static int checkAndGetNoOfDays(int year) {
    int days;
    if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
      days = 29;
    } else {
      days = 28;
    }
    return days;
  }
}
