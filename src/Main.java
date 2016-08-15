import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.util.Scanner;

/**
 * Clase principal, se encarga de solicitar al usuario el tipo de stack que se utilizara y mostrar el resultado.
 * @author Eric Mendoza 15002
 * @author Jonnathan Juarez 15377
 * @since 14/08/2016
 * @version 2.0
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader datos = new BufferedReader(new FileReader("datos.txt"));  // Abre documento para su lectura
        String operacion = datos.readLine();  // Lee la unica linea y la guarda como string
        datos.close();  // Se finaliza el lector

        System.out.println("Bienvenido! \nSeleccione el tipo de memoria que desea utilizar (Lista/Vector/ArrayList): ");

        String tipoMemoria = "";
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()){
            tipoMemoria = scanner.nextLine();
        }

        if (tipoMemoria.equalsIgnoreCase("Lista")){
            System.out.println("Ingrese el tipo de lista que desea utilizar (Simple/Doble/Circular): ");
            if (scanner.hasNext()){
                tipoMemoria = scanner.nextLine();
            }
        }

        CalculadoraP calculadora = CalculadoraP.getInstance();

    }
}
