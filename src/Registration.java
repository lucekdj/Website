
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        System.out.println("Welcome to Apple Store! Please register in order to proceed.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstName = sc.nextLine();
        System.out.println("Please enter your last name: ");
        String lastname = sc.nextLine();

        String username = firstName + "_" + lastname;
        System.out.println("Your username now is: " + username);
        System.out.println("Please create your password: ");
        String password = sc.nextLine();
        System.out.println("Thank you for registering! For your next visit please use the following credentials to log in: " +
                           "\nUsername: " + username +
                           "\nPassword: " + password);

    }
}
