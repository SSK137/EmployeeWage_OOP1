import java.util.*;
public class EmployeeWage_OOP1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Using OOP Concepts");

        Random rdm = new Random();          //rdm is veriable name for Random function
        int present = rdm.nextInt(2);
        int wagePerHR=20;
        int FullDayHR=8;
        int DailyWage= present*wagePerHR*FullDayHR;

        //Checking Employee is present or not
        if(present==1){
            System.out.println("Employee is Present So Daily Wage is :"+DailyWage);
        }
        else {
            System.out.println("Employee is absent So Daily Wage is :"+DailyWage);
        }
    }
}
