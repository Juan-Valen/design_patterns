package A13_visitor;

import java.util.HashSet;
import java.util.Set;

public class Directory implements FileSystemElement {
    private Set<FileSystemElement> elements = new HashSet<FileSystemElement>();
    private FileSystemVisitor fsv;
    private String name;

    public Directory(String name) {
        this.name = name;
    }

    public void accept(FileSystemVisitor fsv) {
        this.fsv = fsv;
    };

    public void visit() {
        fsv.visit(this);
    };

    public void addElement(FileSystemElement element) {
        elements.add(element);
    }

    public Set<FileSystemElement> getElements() {
        return elements;
    }

    public String getName() {
        return name;
    }

}
