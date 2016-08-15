import java.util.ArrayList;
import java.util.Vector;

/**
 * Clase abstracta que sirve para obtener las factories de los tres tipos de stack
 * @author Eric Mendoza 15002
 * @author Jonnathan Juarez 15377
 * @since 14/08/2016
 * @version 2.0
 */
public abstract class AbstractFactory {
    abstract Stack getStackList(String list);
    abstract Stack getStackVector(String vector);
    abstract Stack getStackArrayList(String arrayList);
}