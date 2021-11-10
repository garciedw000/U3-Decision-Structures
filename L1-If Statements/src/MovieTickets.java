import java.util.Scanner;

public class MovieTickets {


    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("How much money do you have?");
        double money = read.nextDouble();

        if(money >= 10){
            System.out.println("You can buy a ticket.");
        }

        if(money > 20){
            System.out.println("You can also buy popcorn.");
        }

        if(money < 10){
            System.out.println("You can't buy a ticket.");
        }

    }
}
