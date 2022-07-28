package application;

import Entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.printf("Final grade: %.2f%n", student.finalGrade());

        if(student.finalGrade() < 60.0){
            System.out.println("Failed");
            System.out.printf("Missing %.2f points%n", student.missingPoints());
        }else{
            System.out.println("Pass");
        }

        sc.close();
    }
}
