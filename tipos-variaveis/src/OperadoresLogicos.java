import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userBd = "eugeniosf";
        String passwordBd = "admin";

        String user;
        String password;

        System.out.println("Write your user: ");
        user = input.nextLine();

        System.out.println("Write your password: ");
        password = input.nextLine();

        if (user.equals(userBd) && password.equals(passwordBd)) {
            int age;
            double height;
            
            System.out.println("You're logged !");
            System.out.println("To enter in the event you need to inform us your height and age");
            System.out.println("You must be 18 older OR height bigger than 1.80");

            System.out.println(".......................................................");

            System.out.println("Enter your age:");
            age = input.nextInt();

            System.out.println("Enter your height:");
            height = input.nextDouble();

            if (age >= 18 || height >= 1.80) {
                System.out.println("Congratulations! You entered the event.");
            }
            else{
                System.out.println("Oh no, you can't.");
            }
        }
        else{
            System.out.println("Try again later.");
        }
    }
}
