import java.util.Scanner;

public class Grades {

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String grade = "";

        System.out.print("Please enter your percentage grade:");
        double percentage = read.nextDouble();

        if(percentage < 60){
            grade = "F";
        }

        if(percentage >= 60){
            grade = "D";
        }

        if(percentage >= 70){
            grade = "C";
        }

        if(percentage >= 80){
            grade = "B";
        }

        if(percentage >= 90){
            grade = "A";
        }

        System.out.println("Your grade is " + grade);
    }
}