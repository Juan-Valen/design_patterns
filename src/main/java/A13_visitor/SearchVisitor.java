package A13_visitor;

import java.util.HashSet;
import java.util.Set;

public class SearchVisitor implements FileSystemVisitor {
    private String searchValue;

    public SearchVisitor(String sv) {
        this.searchValue = sv;
    }

    public void visit(File file) {
        System.out.println("This is not a directory!");
    };

    public void visit(Directory dir) {
        Set<File> files = new HashSet<>(searchInDirectory(dir));

        System.out.println("Files that contain value " + searchValue);
        for (File file : files) {
            System.out.println("  - " + file.getName());
        }
    };

    private Set<File> searchInDirectory(Directory dir) {
        Set<File> files = new HashSet<>();
        for (FileSystemElement element : dir.getElements()) {
            if (element instanceof Directory) {
                files.addAll(searchInDirectory((Directory) element));
            } else if (element instanceof File) {
                if (((File) element).getName().contains(searchValue)) {
                    files.add((File) element);
                }
            }
        }
        return files;
    }
}
