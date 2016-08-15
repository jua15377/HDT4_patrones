/**
 * Created by Eric on 15/08/2016.
 */
public class ListFactory extends AbstractFactory {
    @Override
    Stack getStackList(String list) {
        if (list.equalsIgnoreCase("Simple")){
            return new StackSinglyLinkedList();
        }

        return null;
    }

    @Override
    Stack getStackVector(String vector) {
        return null;
    }

    @Override
    Stack getStackArrayList(String arrayList) {
        return null;
    }
}
