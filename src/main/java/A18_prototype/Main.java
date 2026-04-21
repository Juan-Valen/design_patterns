package A18_prototype;

public class Main {

    public static void main(String[] args) {
        try {
            Recommendation original = new Recommendation("Sci-Fi Fans");
            original.addBook(new Book("Project Hail Mary", "Andy Weir"));
            original.addBook(new Book("Dune", "Frank Herbert"));

            Recommendation copy = original.clone();

            copy.targetAudience = "Hard Sci-Fi Fans";

            copy.addBook(new Book("The Martian", "Andy Weir"));

            // 4. Display results
            System.out.println("--- Original Recommendation ---");
            printRecommendation(original);
            System.out.println("\n--- Cloned Recommendation (Modified) ---");
            printRecommendation(copy);

            // Final Check
            System.out.println("\nVerification:");
            System.out.println("Are the lists different objects? " + (original.books != copy.books));
            System.out
                    .println("Are the book objects inside different? " + (original.books.get(0) != copy.books.get(0)));
        } catch (Exception e) {
            e.printStackTrace(); // This will print the actual error to your console
        }
    }

    private static void printRecommendation(Recommendation rec) {
        System.out.println("Audience: " + rec.targetAudience);
        for (Book b : rec.books) {
            System.out.println(" - Book: " + b.title + " by " + b.author);
        }
    }
}
