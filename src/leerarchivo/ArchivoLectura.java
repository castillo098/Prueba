package leerarchivo;

import java.io.FileWriter;
import java.io.PrintWriter;

public class ArchivoLectura {

    public static void main(String[] args) {
        FileWriter archivo = null; //Escribimos variables de tipo FileWrite con el ombre del archivo
        PrintWriter escritor = null;// Es la escritora que nos permite dar texto al bloc de notas
        try {
            archivo = new FileWriter("C:\\Users\\USER\\Desktop\\prueba.txt");
            escritor = new PrintWriter(archivo); //Enviar el archivo
            escritor.println("Meta #1: Ser feliz");
            escritor.println("Meta #2: Tener una profesion");
            escritor.println("Meta #3: Ser un gran profesional");
            escritor.println("Meta #4: Sacar a mi familia adelante");
            escritor.println("Meta #5: Ser una buena persona para la sociedad");
            archivo.close();
        } catch (Exception e) {
            System.out.println("Error i" + e.getMessage());
        }
    }
}
