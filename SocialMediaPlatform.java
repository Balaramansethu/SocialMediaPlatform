import java.util.Objects;
import java.util.Scanner;

public class SocialMediaPlatform {
    public static void createAccount(String name,String email, String password)
    {
        System.out.println("Welcome "+name);
        System.out.println("Registered mailID : "+email);
    }
    public static void main(String[] args)
    {

        do {
            System.out.println("Welcome to Social media -O- ");
            System.out.println("Create Account -- yes to continue");
            Scanner scan = new Scanner(System.in);
            String userChoice = scan.nextLine();
            if(Objects.equals(userChoice, "yes"))
            {
                    System.out.println("Enter your name : ");
                    String name = scan.nextLine();

                    System.out.println("Enter your e-mail ID : ");
                    String email = scan.nextLine();

                    System.out.println("Enter your password : ");
                    String password = scan.nextLine();
                    createAccount(name,email,password);
                    break;
            }
            else if (Objects.equals(userChoice, "exit")) {
                System.out.println("Thank you for using Social Media -O-");
                break;
            } else {
                System.out.println("Invalid choice. Please type 'yes' to create an account or 'exit' to quit.");
            }

        }
        while (true);


    }
}
