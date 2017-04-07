package visitor;

import java.util.Arrays;

public class Computer implements ComputerPart {

    private ComputerPart[] parts;
    
    public Computer() {
        parts = new ComputerPart[] {new Keyboard(), new Mouse(), new Monitor()};
    }
    
    @Override
    public void accept(ComputerPartVisitor visitor) {
        Arrays.stream(parts).forEach(part -> part.accept(visitor));
        visitor.visit(this);
    }

}
