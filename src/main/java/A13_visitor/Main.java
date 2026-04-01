package A13_visitor;

public class Main {
    public static void main(String[] args) {

        // Create files
        File f1 = new File("notes.txt", 5);
        File f2 = new File("image.png", 12);
        File f3 = new File("todo.txt", 3);
        File f4 = new File("presentation.ppt", 20);

        // Create directories
        Directory root = new Directory("root");
        Directory docs = new Directory("docs");
        Directory images = new Directory("images");

        // Build structure
        root.addElement(docs);
        root.addElement(images);
        docs.addElement(f1);
        docs.addElement(f3);
        images.addElement(f2);
        images.addElement(f4);

        // --- SIZE VISITOR ---
        System.out.println("=== SIZE VISITOR ===");
        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        root.accept(sizeVisitor);
        root.visit(); // triggers visitor

        // --- SEARCH VISITOR ---
        System.out.println("\n=== SEARCH VISITOR ===");
        SearchVisitor searchVisitor = new SearchVisitor("txt");
        root.accept(searchVisitor);
        root.visit(); // triggers visitor
    }
}
