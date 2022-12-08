package com.careerit.corejava.day2;

import java.util.Scanner;

public class GradeSystem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the score :");
    int score = sc.nextInt();
    String grade = "";
    if(score >= 0 && score <= 5){
        grade = "D";
    }else if(score >=6 && score <= 7){
        grade = "C";
    }else if(score >=8 && score <= 9){
        grade = "B";
    }else if(score == 10){
        grade = "A";
    }else{
        grade = "Invalid score, grade can't be given";
    }
    System.out.println("Score :"+score+" and grade is :"+grade);
  }

}
