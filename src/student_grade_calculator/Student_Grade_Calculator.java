/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student_grade_calculator;

import java.util.Scanner;

/**
 *
 * @author Ankit
 */
class Grade{

   
     public String grade(int grade){
         switch ( grade/10){
            case 10:
                 return "A+";
            case 9:
                 return "A";
            case 8:
                 return "B+";
            case 7:
                return "B";
            case 6:
                return "c";
            case 5:
                return "D";
            default:
                return "Fail";
         }
     }
 }


public class Student_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Grade g=new Grade();
        int Marks=0,tMarks;
        tMarks = 0;
        System.out.println("How many subject in your course?");
        int courseSub=sc.nextInt();
        System.out.println("Enter he subject Marks;");
        for (int i = 0; i < courseSub; i++) {
            int sub=sc.nextInt();
             tMarks=Marks+=sub;
        }
        System.out.println("Total Marks:-"+tMarks);
        int avg=tMarks/courseSub;
        System.out.println("Average:- "+avg);
        String grade=g.grade(avg);
        System.out.println("Grade:-"+grade);
    }

    
    
}

