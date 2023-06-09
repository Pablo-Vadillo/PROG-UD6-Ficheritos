package Ejercicio1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text="";

        while (text.length()<=30 ) {
            System.out.println("Enter text: ");
            text = scanner.nextLine();

                text = text.replace(" ","_");
                text = text.toUpperCase();

            if(text.length()<=30){
                System.out.println("Character remain to complete the text: " + (30 - text.length()));
            }

        }
        System.out.println("Text: " + text);
    }
}