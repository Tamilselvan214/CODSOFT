//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of subjects: ");
        int n = sc.nextInt();
        int totSum=0;
        System.out.println("Enter the Marks one by one: ");
        for(int i=0;i<n;i++){
            int marks = sc.nextInt();
            totSum += marks;
        }
        System.out.println("Total Marks Scored: "+totSum);
        int avgPer = totSum/n;
        System.out.println("Average Percentage Scored: "+avgPer+"%");
        String grade;
        if(avgPer >= 90){
            grade = "O";
        }else if(avgPer >= 80 && avgPer < 90){
            grade = "A+";
        }else if(avgPer >= 70 && avgPer < 80){
            grade = "A";
        } else if (avgPer >= 60 && avgPer < 70) {
            grade = "B";
        }else{
            grade = "C";
        }
        System.out.println("Grade Obtained: "+grade);
        sc.close();
    }
}