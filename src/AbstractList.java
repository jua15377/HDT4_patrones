/**
 * Clase abstracta que implementa la interfaz List. En ella se define el comportamiento general para
 * los 3 tipos de lista.
 * @author Douglas Barrios
 * @since 14/08/2016
 * @version 1.0
 */
public abstract class AbstractList<E>
        implements List<E> {
    public AbstractList()
    // post: does nothing
    {
    }

    public boolean isEmpty()
    // post: returns true iff list has no elements
    {
        return size() == 0;
    }

    public boolean contains(E value)
    // pre: value is not null
    // post: returns true iff list contains an object equal to value
    {
        return -1 != indexOf(value);
    }
}