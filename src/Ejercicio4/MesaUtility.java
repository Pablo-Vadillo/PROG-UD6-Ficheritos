package Ejercicio4;

import java.io.FileWriter;
import java.io.IOException;

public class MesaUtility {

    public  static void guardarMesa() throws IOException {
        String nombreFichero = "src/Ejercicio4/Actividad4.txt";
        FileWriter archivo = new FileWriter(nombreFichero);
        Mesa mesa = new Mesa(4,"negro");
        String texto = String.valueOf(mesa);
        archivo.write(texto);
        archivo.close();
    }

    public void obtenerMesa(){
        System.out.println("Hammod habibi2");
    }

}
