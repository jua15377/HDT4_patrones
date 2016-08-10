import java.util.ArrayList;

public class StackArrayList<E>
 implements Stack<E>
{
	protected ArrayList<E> data;

	/**
	 * Constructor
	 */
	public StackArrayList()
	// post: constructs a new, empty stack
	{
		data = new ArrayList<E>();
	}

	/**
	 * Sirve para mandar un dato al stack
	 * @param item, Es el item que se quiere ingresar al stack
     */
	public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.add(item);
	}

	/**
	 * Es para obtener de vuelta un valor del stack
	 * @return Será del tipo del stack
     */
	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.remove(size()-1);
	}

	/**
	 * Sirve para observar los datos delntro del stack
	 * @return devuelve los valores
     */
	public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(size() - 1);
	}

	/**
	 * Dice el tamaño de la lista en el stack
	 * @return tamaño del stack
     */
	public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}

	/**
	 * Sirve para verificar si está vacía la lista del stack
	 * @return true o false
     */
	public boolean empty()
	// post: returns true if and only if the stack is empty
	{
		return size() == 0;
	}
}