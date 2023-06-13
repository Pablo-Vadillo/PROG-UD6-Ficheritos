package Ejercicio4;

import java.io.FileWriter;
import java.io.IOException;
import static Ejercicio4.MesaUtility.guardarMesa;

public class Actividad4 {

    public static void main(String[] args) throws IOException {
        String nombreFichero = "src/Ejercicio4/Actividad4.txt";
        FileWriter archivo = new FileWriter(nombreFichero);

        guardarMesa();
        guardarMesa();

    }
}
