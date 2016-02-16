package theironyard;

/**
 * Created by branden on 2/16/16 at 11:50.
 */
public class ToDoItem {

    String text;
    Boolean isDone;

    public ToDoItem(String text) {
        this.text = text;
        this.isDone = false;
    }

    @Override
    public String toString() {
        return this.text + (isDone ? " (done)" : "");
    }
}