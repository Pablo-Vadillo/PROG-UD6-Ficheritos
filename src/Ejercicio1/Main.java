package Ejercicio1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text="";

        while (text.length()<=30 ) {
            System.out.println("Enter text: ");
            text = scanner.next();

            if(text.length()<=30){
                System.out.println("Character remain to complete the text: " + (30 - text.length()) );
            }

        }

        System.out.println("User: "+ userName);
        System.out.println("Password: " + password);
    }
}