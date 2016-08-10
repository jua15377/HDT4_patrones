import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.util.Scanner;

/**
 * Esta clase
 * @author Eric Mendoza 15002
 * @author Jonnathan Juarez 15377
 * @since 21/07/2016
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Bienvenido!\nSeleccione el archivo .TXT con la instruccion\n(presiona ENTER para continuar)");
        String source = "";
        ingreso.nextLine();
        /*
         codigo tomado de :
         http://stackoverflow.com/questions/7494478/jfilechooser-from-a-command-line-program-and-popping-up-underneath-all-windows
         */

        JFileChooser chooser = new JFileChooser(System.getProperty("java.class.path"));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                Scanner inputFile = new Scanner(new File(chooser.getSelectedFile().getAbsolutePath()));
                 source = chooser.getSelectedFile().getAbsolutePath();
            }
            catch (FileNotFoundException e) {
                System.out.println("No se sseleciono ningun archivo");

            }
        }


        try
        {
            BufferedReader datos = new BufferedReader(new FileReader(source));  // Abre documento para su lectura
            String operacion = datos.readLine();  // Lee la unica linea y la guarda como string
            datos.close();  // Se finaliza el lector


            Calculadora calculadora = new Calculadora();

            System.out.println("\nEl resultado de \"" + operacion + "\" es:");
            System.out.println(calculadora.operar(operacion));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Archivo no valido!!!");
        }
    }
}
