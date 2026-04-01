package A13_visitor;

public class File implements FileSystemElement {
    private String name;
    private int size;
    private FileSystemVisitor fsv;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void accept(FileSystemVisitor fsv) {
        this.fsv = fsv;
    };

    public void visit() {
        fsv.visit(this);
    };

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}
