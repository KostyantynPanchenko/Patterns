
package memento;

public class Client {

    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();

        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
        fileWriter.write("First Set of Data\n");
        fileWriter.write("Some more data.\n");
        caretaker.save(fileWriter);
        System.out.println(fileWriter);

        fileWriter.write("MODIFIED.\n");
        caretaker.save(fileWriter);
        System.out.println(fileWriter);
        
        fileWriter.write("MOD #2.\n");
        caretaker.save(fileWriter);
        System.out.println(fileWriter);

        // lets undo to last save
        System.out.println("Restoring...");
        caretaker.load(fileWriter);
        System.out.println(fileWriter);
        
        System.out.println("Restoring...");
        caretaker.load(fileWriter);
        System.out.println(fileWriter);
        
        System.out.println("Restoring...");
        caretaker.load(fileWriter);
        System.out.println(fileWriter);

    }

}
