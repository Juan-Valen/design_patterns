package A13_visitor;

public interface FileSystemElement {

    void accept(FileSystemVisitor fsv);
    void visit();
}
