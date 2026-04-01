package A13_visitor;

class SizeCalculatorVisitor implements FileSystemVisitor {
    public void visit(File file) {
        System.out.println("File " + file.getName() + " size is Mb " + file.getSize());
    };

    public void visit(Directory dir) {
        int size = calculateDirectorySpace(dir);
        System.out.println("Directory " + dir.getName() + " size is Mb " + size);
    };

    public int calculateDirectorySpace(Directory dir) {
        int size = 0;
        for (FileSystemElement element : dir.getElements()) {
            if (element instanceof Directory) {
                size += calculateDirectorySpace((Directory) element);
            } else if (element instanceof File) {
                size += ((File) element).getSize();
            }
        }
        return size;
    }
}
