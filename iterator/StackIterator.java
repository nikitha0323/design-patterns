package iterator;

/**
 * StackIterator class for iterator
 * iterating over the elements in a stack from recnt changes to the oldest
 * basically an iterator interface for working with the stack's contents
 * @author nikitha kondapeta
 */

import java.util.Iterator;
import java.util.Stack;

public class StackIterator implements Iterator<String> 
{

    private Stack<String> items;
    private int position;
    /**
     * constructing a new StackIterator referencing to a stack of strings.
     * @param items the stack of strings to iterate over
     */

    public StackIterator(Stack<String> items) 
    {
        this.items = items;
        this.position = items.size() - 1;
    }

    /**
     * checking to see if theres extra elements to iterate over in the stack
     * @return true if any elements found or returns false
     */
    public boolean hasNext() 
    {
        return position >= 0;
    }

    /**
     * finding the next element in the stack and moves the position of iterator
     * @return the next element in the stack
     */
    public String next() 
    {
        if (hasNext()) 
        {
            String nextItem = items.get(position);
            position--;
            return nextItem;
        } 
        else 
        {
            throw new UnsupportedOperationException("No more items in the iterator.");
        }
    }
}
