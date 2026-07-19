package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeerArchivos {

    public static BufferedReader leerArchivo(String nombreArchivo) {

        InputStream is = LeerArchivos.class
                .getClassLoader()
                .getResourceAsStream(nombreArchivo);

        if(is == null){
            System.out.println("No se encontró el archivo: " + nombreArchivo);
            return null;
        }

        return new BufferedReader(new InputStreamReader(is));
    }

}