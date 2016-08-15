import java.util.Iterator;

/**
 * Interfaz general de Lista
 * @author Douglas Barrios
 * @since 14/08/2016
 * @version 1.0
 */
public interface List<E>
{
    int size();
    // post: returns number of elements in list

    boolean isEmpty();
    // post: returns true iff list has no elements

    void clear();
    // post: empties list

    void addFirst(E value);
    // post: value is added to beginning of list

    void addLast(E value);
    // post: value is added to end of list

    E getFirst();
    // pre: list is not empty
    // post: returns first value in list

    E getLast();
    // pre: list is not empty
    // post: returns last value in list

    E removeFirst();
    // pre: list is not empty
    // post: removes first value from list

    E removeLast();
    // pre: list is not empty
    // post: removes last value from list

    E remove(E value);
    // post: removes and returns element equal to value
    // otherwise returns null

    void add(E value);
    // post: value is added to tail of list

    E remove();
    // pre: list has at least one element
    // post: removes last value found in list

    E get();
    // pre: list has at least one element
    // post: returns last value found in list

    boolean contains(E value);
    // pre: value is not null
    // post: returns true iff list contains an object equal to value

    int indexOf(E value);
    // pre: value is not null
    // post: returns (0-origin) index of value,
    // or -1 if value is not found

    int lastIndexOf(E value);
    // pre: value is not null
    // post: returns (0-origin) index of value,
    // or -1 if value is not found

    E get(int i);
    // pre: 0 <= i < size()
    // post: returns object found at that location

    E set(int i, E o);
    // pre: 0 <= i < size()
    // post: sets ith entry of list to value o;
    // returns old value

    void add(int i, E o);
    // pre: 0 <= i <= size()
    // post: adds ith entry of list to value o

    E remove(int i);
    // pre: 0 <= i < size()
    // post: removes and returns object found at that location

    Iterator<E> iterator();
    // post: returns an iterator allowing
    // ordered traversal of elements in list
}
