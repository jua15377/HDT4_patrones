/**
 * Es el elemento basico de una lista doblemente encadenada.
 * @author Douglas Barrios
 * @since 14/08/2016
 * @version 1.0
 */
public class DoublyLinkedNode<E> {
    protected E data;
    protected DoublyLinkedNode<E> nextElement;
    protected DoublyLinkedNode<E> previousElement;

    public DoublyLinkedNode(E v,
                            DoublyLinkedNode<E> next,
                            DoublyLinkedNode<E> previous) {
        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
        previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }

    public DoublyLinkedNode(E v)
// post: constructs a single element
    {
        this(v, null, null);
    }

    public DoublyLinkedNode<E> previous(){
        return previousElement;
    }

    public void setNext(DoublyLinkedNode<E> nextElement){
        this.nextElement = nextElement;
    }

    public E value(){
        return data;
    }
}