package A12_proxy;

public class Main {

    public static void main(String[] args) {
        AccessControlService acs = new AccessControlService();
        Library library = new Library();

        User saara = new User("saara");
        User roman = new User("roman");
        User[] users = new User[] { saara, roman };

        IDocument doc1 = new Document("doc1", "public content 1");
        IDocument doc2 = new Document("doc2", "public content 2");
        IDocument doc3 = new DocumentProxy("doc3", "private content", acs);
        IDocument doc4 = new DocumentProxy("doc4", "top secret content", acs);

        library.addDocument(doc1);
        library.addDocument(doc2);
        library.addDocument(doc3);
        library.addDocument(doc4);

        acs.allowUser(doc3.getUuid(), saara.getUsername());
        acs.allowUser(doc3.getUuid(), roman.getUsername());
        acs.allowUser(doc4.getUuid(), roman.getUsername());

        for (User user : users) {
            for (int i = 1; i < 5; i++) {
                try {
                    IDocument d = library.getDocument("doc" + i);
                    System.out.println(user.getUsername() + " reads " + d.getUuid() + ": " +
                            d.getContent(user));
                } catch (AccessDeniedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
