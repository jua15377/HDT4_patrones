import java.util.Vector;

/**
 * Implementacion de la interfaz Stack en forma de vector
 * @author Eric Mendoza 15002
 * @author Jonnathan Juarez 15377
 * @since 14/08/2016
 * @version 2.0
 */

public class StackVector<E> extends Vector<E> implements Stack<E>{
    protected Vector<E> data;

    /**
     * Constructor
     */
    public StackVector()
    // post: constructs a new, empty stack
    {
        data = new Vector<E>();
    }

    /**
     * Agrega un valor a la cabeza del stack
     * @param item es el elemento que se desea agregar
     */
    public void push(E item)
    // post: the value is added to the stack
    //     will be popped next if no intervening push
    {
        data.add(item);
    }

    /**
     * Retorna el valor que se encuentra a la cabeza del stack
     * @return retorna el ultimo elemento agregado
     */
    public E pop()
    // pre: stack is not empty
    // post: most recently pushed item is removed and returned
    {
        return data.remove(size()-1);
    }

    /**
     * Muestra el elemento que se encuentra a la cabeza del stack
     * @return retorna el ultimo elemento agregado
     */
    public E peek()
    // pre: stack is not empty
    // post: top value (next to be popped) is returned
    {
        return data.get(size() - 1);
    }

    /**
     * Para saber el tamano actual del stack
     * @return retorna el numero de elementos en el stack
     */
    public int size()
    // post: returns the number of elements in the stack
    {
        return data.size();
    }

    /**
     * Para verificar si el stack esta vacio o no
     * @return retorna verdadero si y solo si el stack esta vacio
     */
    public boolean empty()
    // post: returns true if and only if the stack is empty
    {
        return size() == 0;
    }
}