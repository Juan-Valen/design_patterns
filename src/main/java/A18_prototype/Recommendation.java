package A18_prototype;

import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Cloneable {

    String targetAudience;
    List<Book> books = new ArrayList<>();

    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Recommendation clone() {
        try {
            Recommendation clonedRecommendation = (Recommendation) super.clone();
            clonedRecommendation.books = new ArrayList<>();
            // deep copy
            for (Book book : this.books) {
                clonedRecommendation.addBook(book.clone());
            }
            return clonedRecommendation;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
