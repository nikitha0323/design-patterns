package iterator;

/**
 * Document class for iterator
 * keeping track of undo and redo stacks and other changes 
 * made to the document
 * @author nikitha kondapeta
 */

import java.util.Stack;

public class Document 
{
    private String title;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    /**
     * setting a title to the new document 
     * @param title the title of the document
     */

    public Document(String title) 
    {
        this.title = title;
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }

    /**
     * changes to the document to be made and record in the undoStack
     * @param change changes made to the document
     * @return if the change is made
     */

    public String makeChange(String change) 
    {
        undoStack.push(change);
        redoStack.clear();
        return "Making Change: " + change;
    }

    /**
     * undoing the most recent change and moving to redoStack
     * @return a message popping when undo change is done
     */

    public String undoChange() 
    {
        if (canUndo()) 
        {
            String undoneChange = undoStack.pop();
            redoStack.push(undoneChange);
            return "Undoing: " + undoneChange;
        } 
        else 
        {
            return "Sorry there is nothing to undo";
        }
    }

    /**
     * checking for changes that can be undone
     * @return true if changes to undo, or false
     */
    public boolean canUndo() 
    {

        return !undoStack.isEmpty();
    }
    /**
     * redoing the recent undone change and moving back to undoStack
     * @return message showing the redone change
     */
    public String redoChange() 
    {
        if (canRedo()) 
        {
            String redoneChange = redoStack.pop();
            undoStack.push(redoneChange);
            return "Redoing: " + redoneChange;
        } 
        else 
        {
            return "Sorry there is nothing to redo";
        }
    }
    /**
     * checking for any redone changes
     * @return true if there are any changes to redo or false
     */
    public boolean canRedo() 
    {
        return !redoStack.isEmpty();
    }

    /**
     * gets an iterator for the undoStack to transverse changes made to the document
     * @return an iterator for the undoStack
     */
    public StackIterator getUndoIterator() 
    {
        return new StackIterator(undoStack);
    }

    /**
     * gets an iterator for the redoStack to transverse undone changes made to the document
     * @return
     */
    public StackIterator getRedoIterator() 
    {
        return new StackIterator(redoStack);
    }
}
