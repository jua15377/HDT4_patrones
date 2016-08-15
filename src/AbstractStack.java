
/**
 * Clase abstracta que implementa la interfaz Stack. Esta clase sirve para definir los comportamientos comunes de todos
 * los tipos stack
 * @author Eric Mendoza 15002
 * @author Jonnathan Juarez 15377
 * @since 14/08/2016
 * @version 2.0
 */

public abstract class AbstractStack<E> implements Stack<E>{
    /**
     * Constructor, no hace nada
     */
    public AbstractStack(){}

    /**
     * Para verificar si el stack esta vacio o no
     * @return retorna verdadero si y solo si el stack esta vacio
     */
    public boolean empty() {
        return size() == 0;
    }

}
