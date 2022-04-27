import java.util.*;
public class EmployeeWage_OOP1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Using OOP Concepts");

        Random rdm = new Random();          //rdm is veriable name for Random function
        int present = rdm.nextInt(2);
        int wagePerHR=20;
        int DailyWage,wrkingHR = 0;

        //Checking Employee is present or not
        if(present==1){
            wrkingHR=8;
            System.out.println("Employee is Present for full time");
        }
        else if(present==0){
            wagePerHR=0;
            System.out.println("Employee is absent");
        }
        else {
            wrkingHR=4;
            System.out.println("Employee Is present for part time also");
        }

        DailyWage= wagePerHR * wrkingHR;
        System.out.println("Daily Wage is :"+DailyWage);
    }
}
