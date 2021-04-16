package leerarchivo;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Metodo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese direccion del archivo");
        String direccion = entrada.nextLine();
        System.out.println("Ingrese el texto a escribir en el archivo");
        String texto = entrada.nextLine();

        Metodo objeto = new Metodo();
        objeto.escribirArchivo(texto, direccion);
    }

    public void escribirArchivo(String mensaje, String direccion_archivo) {
        try {
            FileWriter archivo = new FileWriter(direccion_archivo);
            PrintWriter escribir = new PrintWriter(archivo);
            escribir.println(mensaje);
            archivo.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
