package Ejercicio3;

import java.io.*;

public class Actividad3 {

    public static void main(String[] args) throws IOException {
        String nombreFichero = "src/Ejercicio3/Actividad3.txt";

        FileWriter archivo = new FileWriter(nombreFichero);
        archivo.close();

        String contenidoUno = obtenerContenido("src/Ejercicio1/Actividad1.txt");
        String contenidoDos = obtenerContenido("src/Ejercicio2/Actividad2.txt");

        FileWriter archivoActividad3 = new FileWriter(nombreFichero);
        archivoActividad3.write("Contenido del Fichero Uno: " + contenidoUno + "\n");
        archivoActividad3.write("Contenido del Fichero Dos: " + contenidoDos + "\n");

        archivoActividad3.write("Mensaje de firma de Pablo Vadillo");

        archivoActividad3.close();
    }

    public static String obtenerContenido(String nombreFichero) throws IOException {
        FileReader fileReader = new FileReader(nombreFichero);
        String contenido = "";

        int caracter;
        while ((caracter = fileReader.read()) != -1) {
            contenido += (char) caracter;
        }

        fileReader.close();
        return contenido;
    }
}

