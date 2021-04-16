package leerarchivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class EscrituraArchivos {

    public void leer(String ruta) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {//bloque try para poder cahar culaquier excepcion
            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            //Lectura Linea por Linea 
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println("linea");
            }
        } catch (Exception e) {
            System.out.println("Algo salio mal :");
        } finally {//En el bloque finally cerramos el fr
        }
        try {
            if (null != fr) {
                fr.close();
            }
        } catch (Exception e) {
            System.out.println("No se puedo cerrar el archivo");
        }
    }

    public void escribir(String ruta) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try { //bloque try para poder cachar cualquier excepcion
            fichero = new FileWriter(ruta);
            pw = new PrintWriter(fichero);
            for (int i = 0; i < 10; i++) {
                pw.println("Linea: " + 1);
            }

        } catch (Exception e) {
            System.out.println("Algo salio mal: (");
        } finally { //En el bloque finally cerramos el fichero
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                System.out.println("No se pudo cerra el archivo");
            }
        }
    }
}
