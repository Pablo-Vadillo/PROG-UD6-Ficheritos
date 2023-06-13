package Ejercicio2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Actividad2 {

    public static void main(String[] args) throws IOException {
        String texto = "Este es un texto de ejemplo Hammod Habibi.";

        FileWriter archivo = new FileWriter("src/Ejercicio2/Actividad2.txt");
        archivo.write(texto);
        archivo.close();

        FileReader fileReader = new FileReader("src/Ejercicio2/Actividad2.txt");

        int caracter;
        String contenido = "";
        while ((caracter = fileReader.read()) != -1) {
            contenido += (char) caracter + "_" + caracter + ",";
        }

        String strNew = contenido.substring(0, contenido.length()-1);

        fileReader.close();

        System.out.println(strNew);
    }
}
