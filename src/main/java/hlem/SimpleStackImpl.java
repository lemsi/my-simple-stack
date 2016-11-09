package hlem;


/**import java.util.ArrayList;*/
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by 21607179 on 03/11/2016.
 * Un commentaire répondant à l'exigence numéro1
 */
public class SimpleStackImpl implements SimpleStack {
    Stack<Object> wrappedStack=new Stack<Object>();
    ArrayList<Object> wrappedStack = new ArrayList<Object>();

    public boolean isEmpty(){
        return wrappedStack.isEmpty();
    }

    public void push(Item item){
        wrappedStack.add(item);
    }

    public int getSize(){
        return wrappedStack.size();
    }

    public Item peek() throws EmptyStackException {
        return (Item) wrappedStack.get(0);
    }

    public Item pop() throws EmptyStackException{
        return (Item) wrappedStack.get(wrappedStack.size()-1);
    }
}