package Ejercicio1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName="";
        String password="";

        while (password.length()<=30 ) {
            System.out.println("Enter username: ");
            userName = scanner.next();
            System.out.println("Enter password: ");
            password = scanner.next();

            if(password.length()<=30){
                System.out.println("Character remain to complete the password: " + (30 - password.length()) );
            }

        }

        System.out.println("User: "+ userName);
        System.out.println("Password: " + password);








    }
}