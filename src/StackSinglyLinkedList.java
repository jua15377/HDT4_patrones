/**
 * Stack que utiliza como memoria una lista simplemente unida.
 * @author Eric Mendoza 15002
 * @author Jonnathan Juarez 15377
 * @since 14/08/2016
 * @version 2.0
 */
public class StackSinglyLinkedList<E> extends AbstractStack<E> {
    protected SinglyLinkedList<E> data;

    /**
     * Constructor, construye un stack vacio
     */
    public StackSinglyLinkedList() {
        data = new SinglyLinkedList<E>();
    }

    /**
     * Agrega un valor a la cabeza del stack
     * @param item es el elemento que se desea agregar
     */
    @Override
    public void push(E item) {
        data.addFirst(item);
    }

    /**
     * Retorna el valor que se encuentra a la cabeza del stack
     * @return retorna el ultimo elemento agregado
     */
    public E pop() {
        return data.removeFirst();
    }

    /**
     * Muestra el elemento que se encuentra a la cabeza del stack
     * @return retorna el ultimo elemento agregado
     */
    public E peek() {
        return data.getFirst();
    }

    /**
     * Para saber el tamano actual del stack
     * @return retorna el numero de elementos en el stack
     */
    public int size() {
        return data.size();
    }
}
