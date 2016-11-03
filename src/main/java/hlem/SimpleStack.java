package hlem;
import java.util.EmptyStackException;

/**
 * Created by 21607179 on 03/11/2016.
 */
public interface SimpleStack {
    /**
     * Test if this stack is empty
     */
    public boolean isEmpty();
    /**
     * return the number of items in this stack.
     */
    public int getSize();
    /**
     * pushes an item onto the top of this stack.
     * null item is allowed.
     */
    public void push(MySimpleStack.Item item);
    /**
     * looks at the object  at the top of this stack without removing it from the stack.
     */
    public MySimpleStack.Item peek() throws EmptyStackException;
    /**
     * removes the object at the top of this stack and returns that object as the value of this function.
     * @throws java.util.EmptyStackException if this stack is empty.
     */
    public MySimpleStack.Item pop() throws EmptyStackException;
}


