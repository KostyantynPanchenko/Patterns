
package memento;

import java.util.LinkedList;

public class FileWriterCaretaker {

    private LinkedList<Object> saves = new LinkedList<>();

    public void save(FileWriterUtil fileWriter) {
        this.saves.push(fileWriter.save());
    }

    public void undo(FileWriterUtil fileWriter) {
        fileWriter.load(this.saves.pollLast());
    }

}
