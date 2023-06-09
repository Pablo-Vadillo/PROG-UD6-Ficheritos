package Ejercicio1;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileWriter fw = new FileWriter("src/Ejercicio1/Actividad1Fichero.txt");
        String text="";

        while (text.length()<=30 ) {
            System.out.println("Enter text: ");
            text = scanner.nextLine();

                text = text.replace(" ","_");
                text = text.toUpperCase();

            if (text.length()<=30){
                System.out.println("Character remain to complete the text: " + (30 - text.length()));
            } else {
                System.out.println(text);
                fw.write(text);
            }
        }
        fw.close();
    }
}