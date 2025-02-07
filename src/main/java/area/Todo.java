package area;

/**
 * Todo class is child of Task class. It is used to create objects that
 * represent generic tasks that users want to keep track of.
 */
public class Todo extends Task {

    /**
     * Creates an object of type Todo
     * 
     * @param description Description of task.
     */
    public Todo(String description) {
        super(description);
    }

    /**
     * Displays the object in a readable manner
     * 
     * @return String representation of Todo object.
     */
    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
